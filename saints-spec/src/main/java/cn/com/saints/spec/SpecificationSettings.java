package cn.com.saints.spec;

/**
 * Created by MyLady on 16/2/16.
 */
public class SpecificationSettings {
    public static final String DiscoveryProtocolAddress = "239.230.230.230";
    public static final int DiscoveryProtocolPort = 23000;
    public static final int DiscoveryHttpPort = 23001;
    public static final int ProxyServiceHttpPort = 23003;

    public static final String DiscoveryApiPrefix = "/api/v1";
    public static final String DiscoveryLocalHttpAddress = "http://localhost:" + DiscoveryHttpPort + DiscoveryApiPrefix;
    public static String ProxyHttpAddress = "http://ip:" + ProxyServiceHttpPort + DiscoveryApiPrefix;

    public static final String DiscoveryApiDiscovery = "/discovery";
    public static final String DiscoveryApiService = "/services";
    public static final String DiscoveryApiProduct = "/products";
    public static final String ProxyApiService = "/services";

    public static final int NtpSyncInterval = 5 * 60 * 1000;
    public static final int NtpSyncTimeout = 10 * 1000;

    public static final int ProductRegisterInterval = 30 * 1000;
    public static final int ServiceFinderInterval = 5 * 1000;

    public static final int MiniumStickPlayElapsedTime = 30;//seconds

    public static final String DigitalApiStartup = "/startup";

    public static final String JSObjectName = "saints";
}
