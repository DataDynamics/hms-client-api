# Hive Metastore Client API 

## Build

```
mvn clean package
```

## Dependency

* commons-cli 1.4
* hadoop-auth-2.7.3
* hadoop-common-2.7.3
* hadoop-hdfs-2.7.3
* hadoop-mapreduce-client-common-2.7.3
* hadoop-mapreduce-cleint-core-2.7.3
* hive-exe-1.2.10000
* hive-metastore-1.2.10000
* hive-serde-1.2.10000
* hive-shims-1.2.10000
* hive-shims-common-1.2.10000
* hive--shims-common-1.2.10000
* htrace-core4-4.1.0-incubating
* stax2-api-3.1.4
* woodstox-core-5.0.3.jar
* libfb-303-0.9.3

해당 라이브러리를 add-jars로 추가해야 합니다. spring boot는 repackaging true로 설정합니다.

YAML 설정시
* metastore uris : thrift://1.1.1.1:9081
* concurrent-support : true
* transaaction-manager-supporet: true
* transaction-manager-class: org.apache.hadoop.hive.ql.lockmgr.DbTxnManager

```java
HiveConf conf  = new HiveConf(HiveUtils.class);
conf.setVar(HiveCOnf.COnfVars.HIVE_TXN_MANAGER, "");
conf.setBooVar(HiveConf.ConfVars.HIVE_SUPPORT_CONCURRENC, true);
conf.setVar(HiveConf.ConfVars.METASTOREUIRS, "");
```