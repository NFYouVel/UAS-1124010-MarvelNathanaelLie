package uas.models;

public class Fedora extends Linux {

    public Fedora(String version) {
        super("Fedora", version, "KDE Plasma");
    }
    
    public Fedora(String version, String desktopEnvironmentName) {
        super("Fedora", version, desktopEnvironmentName);
    }

    @Override
    public String getBootInfo() {
        return "Booting " + super.getName() + " " + super.getVersion();
    }

}

