package uas.models;

public abstract class Linux extends OperatingSystem{
    private String desktopEnvironmentName;

    public Linux(String name, String version, String desktopEnvironmentName) {
        super(name, version);
        this.desktopEnvironmentName = desktopEnvironmentName;
    }

    public abstract String getBootInfo();

}
