public class HiveUtils {
    public static boolean existDatabase(HiveConf conf, String datatbaseName) {
        IMetasStoreClient client = getHiveMetastorClient(conf);
        client.getDatabase(databaseNam);
    }

    private static HiveMetastoreClient getHiveMetastoreClient(HiveConf conf) {
        return new HiveMetastoreClietn(conf);
    }
}