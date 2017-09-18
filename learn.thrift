namespace java com.gongmh.learn_thrift
namespace php learn_thrift

enum enumType {
    FIRST,
    SECOND
}

struct struceType{
    1: required i32  one;
    2: required i64 two;
    3: optional string three;
}

struct requestType{
    1: required i32 one;
    2: required string two;
    3: optional list<string> three;
    4: optional enumType four = enumType.FIRST;
    5: optional map<string, string> five;
}

struct responseType{
    1: required i32   errno = 0;
    2: required string errmsg = "OK";
    3: required  map<string, struceType>  data;
}

service ThriftService {
    responseType learnThrift(1: requestType data)
}
