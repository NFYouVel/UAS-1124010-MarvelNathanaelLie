package uas.models;

public class Device {
    private String name;
    private OperatingSystem os;

    public Device(String name, OperatingSystem os) {
        this.name = name;
        this.os = os;
    }

    public String getNameDevice() {
        return this.name;
    }

    public OperatingSystem getOperatingSystem() {
        return this.os;
    }
}
