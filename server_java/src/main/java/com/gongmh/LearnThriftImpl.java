package com.gongmh;

import com.gongmh.gen_java.*;

import java.util.HashMap;
import java.util.Map;

class LearnThriftImpl implements ThriftService.Iface{

    public responseType learnThrift(requestType data){
        responseType rt = new responseType();
        System.out.println("hello");

        Map<String,struceType> responseData = new HashMap<String, struceType>();

        struceType struceTypeVar = new struceType();
        struceTypeVar.setOne(1);
        struceTypeVar.setTwo(2);
        struceTypeVar.setThree("three");
        responseData.put("1", struceTypeVar);

        rt.setData(responseData);
        return rt;
    }
}