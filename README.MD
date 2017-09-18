## 介绍

### 1. 代码结构

```
├── README.MD
├── client_php
│   ├── composer.json
│   ├── composer.lock
│   ├── gen_php
│   └── learn_thrift.php
├── learn.thrift
└── server_java
    ├── pom.xml
    └── src

4 directories, 6 files
```


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

