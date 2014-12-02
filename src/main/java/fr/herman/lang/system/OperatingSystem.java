package fr.herman.lang.system;

public enum OperatingSystem {
    WINDOWS("win"),

    MAC_OSX("mac"),

    LINUX("linux"),

    SUN("sun"),

    AIX("aix"),

    UNIX("nix"),

    BSD("bsd"),

    HP_UX("hpux"),

    UNKNOWN;

    private final String[] abbrv;
    private OperatingSystem(String... abbrv) {
        this.abbrv=abbrv;
    }

    public boolean match(String osName) {
        for(String name:abbrv){
            if(osName.contains(name)){
                return true;
            }
        }
        return false;
    }

    public static OperatingSystem resolve(String osName) {
        for (OperatingSystem os : OperatingSystem.values()) {
            if (os != UNKNOWN && os.match(osName)) {
                return os;
            }
        }
        return UNKNOWN;
    }

    public boolean is(OperatingSystem... operatingSystems) {
        if (operatingSystems == null) {
            return false;
        }
        for (OperatingSystem candidate : operatingSystems) {
            if (this == candidate) {
                return true;
            }
        }
        return false;
    }
}
