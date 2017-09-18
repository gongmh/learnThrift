介绍

### 1. 代码结构



### 2. 服务端说明

生成服务端thrift接口

```
thrift -r --gen java learn.thrift
```

server端的语言为java，使用maven管理依赖。


### 3. 客户端说明

生成客户端thrift接口

```
thrift -r --gen php learn.thrift
```

client端的语言为php，使用composer管理依赖。

安装依赖

```
composer install
```

执行

```
php learn_thrift.php
```

