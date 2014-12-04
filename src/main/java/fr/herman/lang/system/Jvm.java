package fr.herman.lang.system;

public enum Jvm {
    ;

    public static final String TMP_DIR = System.getProperty("java.io.tmpdir");

    public static final String FILE_ENCODING = System.getProperty("file.encoding");

    public static final String FILE_SEPARATOR = System.getProperty("file.separator");

    private static final boolean IS_64_BIT = resolve64Bit();

    private static final JavaVersion JAVA_VERSION = JavaVersion.resolve(System.getProperty("java.version"));

    private static final OperatingSystem OS = OperatingSystem.resolve(System.getProperty("os.name").toLowerCase());

    public static boolean is64Bit() {
        return IS_64_BIT;
    }

    private static boolean resolve64Bit() {
        String systemProp;
        systemProp = System.getProperty("com.ibm.vm.bitmode");
        if (systemProp != null) {
            return "64".equals(systemProp);
        }
        systemProp = System.getProperty("sun.arch.data.model");
        if (systemProp != null) {
            return "64".equals(systemProp);
        }
        systemProp = System.getProperty("java.vm.version");
        return systemProp != null && systemProp.contains("_64");
    }

    public static JavaVersion javaVersion() {
        return JAVA_VERSION;
    }

    public static OperatingSystem os() {
        return OS;
    }
}
