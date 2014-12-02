package fr.herman.lang.system;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum JavaVersion {
    VERSION_1_1(false),
    VERSION_1_2(false),
    VERSION_1_3(false),
    VERSION_1_4(false),
    VERSION_1_5(true),
    VERSION_1_6(true),
    VERSION_1_7(true),
    VERSION_1_8(true),
    VERSION_1_9(true);

    private final boolean hasMajorVersion;

    private JavaVersion(boolean hasMajorVersion) {
        this.hasMajorVersion = hasMajorVersion;
    }

    private static final Logger LOG = Logger.getLogger(JavaVersion.class.getCanonicalName());

    public static JavaVersion resolve(String name) throws IllegalArgumentException {
        if (name.matches("\\d")) {
            int index = Integer.parseInt(name) - 1;
            if (index < values().length && values()[index].hasMajorVersion) {
                return values()[index];
            }
        }

        Matcher matcher = Pattern.compile("1\\.(\\d)(\\D.*)?").matcher(name);
        if (matcher.matches()) {
            int versionIdx = Integer.parseInt(matcher.group(1)) - 1;
            if (versionIdx >= 0 && versionIdx < values().length) {
                return values()[versionIdx];
            }
        }
        LOG.log(Level.WARNING, "Could not determine java version from : {0}", name);
        return null;
    }

    @Override
    public String toString() {
        return getName();
    }

    private String getName() {
        return name().substring("VERSION_".length()).replace('_', '.');
    }

    public String getMajorVersion() {
        return name().substring(10);
    }

    public boolean isCompatible(JavaVersion minimumVersion) {
        return this.compareTo(minimumVersion) >= 0;
    }
}
