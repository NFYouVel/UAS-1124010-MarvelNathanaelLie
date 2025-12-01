package uas.controllers;

import java.util.ArrayList;
import java.util.List;

import uas.models.Device;
import uas.models.Fedora;
import uas.models.OperatingSystem;
import uas.models.Ubuntu;
import uas.models.Windows;
import uas.models.enums.TypeOfWindows;
import uas.models.interfaces.IDeviceController;

public class DeviceControllers implements IDeviceController{

    private List<Device> devices;

    public DeviceControllers() {
        devices = new ArrayList<>();
    }
    
    public void addNewDevice(String name, int os, String version, String deskEnvi) {
        Device tempDevice = null;
        if (os == 2) {
            if (deskEnvi.isEmpty()) {
                tempDevice = new Device(name, new Ubuntu(version));
            } else {
                tempDevice = new Device(name, new Ubuntu(version, deskEnvi));
            }
        } else {
            if (deskEnvi.isEmpty()) {
                tempDevice = new Device(name, new Fedora(version));
            } else {
                tempDevice = new Device(name, new Fedora(version, deskEnvi));
            }
        } 
        devices.add(tempDevice);
    } 

    public void addNewDevice(String name, int os ,String version, int typeOfWindows) {

        TypeOfWindows type;
        switch (typeOfWindows) {
            case 1:
                type = TypeOfWindows.PRO;
                break;
            case 2:
                type = TypeOfWindows.HOME;
                break;
            default:
                type = TypeOfWindows.STUDENT;
                break;
        }

        devices.add(new Device(name, new Windows(version, type)));
    }    

    public List<Device> getAllDevices() {
        return devices;
    }

    public void addNewDevice(String name, int input, String version, int os, String deskEnvi) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
