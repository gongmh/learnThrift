<?php

require_once('./vendor/autoload.php');
require_once('./gen_php/Types.php');
require_once('./gen_php/ThriftService.php');

require_once('./vendor/apache/thrift/lib/php/lib/Thrift/ClassLoader/ThriftClassLoader.php');

use Thrift\ClassLoader\ThriftClassLoader;

$loader = new ThriftClassLoader();
$loader->registerNamespace('Thrift', __DIR__);
$loader->register();


use Thrift\Protocol\TBinaryProtocol;
use Thrift\Transport\TSocket;
use Thrift\Transport\THttpClient;
use Thrift\Transport\TFramedTransport;
use Thrift\Exception\TException;

$request = new \gen_php\RequestType();
$request->one = 1;
$request->two = "abc";

$socket = new TSocket('127.0.0.1', 9099);
$transport = new TFramedTransport($socket);
$protocol = new TBinaryProtocol($transport);
$client = new \gen_php\ThriftServiceClient($protocol);

$transport->open();
$response = $client->learnThrift($request);
$transport->close();

echo json_encode($response);
