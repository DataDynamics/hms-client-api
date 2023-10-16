public class hiveUtils {
    public static boolean existDatabase(HiveConf conf, String datatbaseName) {
        IMetasStoreClient client = getHiveMetastorClient(conf);
        client.getDatabase(databaseNam)e;
    }

    private static HiveMetastoreClient getHiveMetastoreClient(HiveConf conf) {
        return new HiveMetastoreClietn(conf);
    }
}