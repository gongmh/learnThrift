package com.gongmh;

import com.gongmh.gen_java.ThriftService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            TProcessor tprocessor = new ThriftService.Processor<ThriftService.Iface>(new LearnThriftImpl());

            TServerSocket serverTransport = new TServerSocket(9099);

            TServer.Args tArgs = new TServer.Args(serverTransport);
            tArgs.processor(tprocessor);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            tArgs.transportFactory(new TFramedTransport.Factory());
            TServer server = new TSimpleServer(tArgs);
            System.out.println("Start server on port 9099...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
