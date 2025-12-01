package uas.views;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import uas.controllers.DeviceControllers;
import uas.models.Device;
import uas.models.exceptions.EmptyListException;
import uas.models.exceptions.InvalidMenuException;
import uas.models.exceptions.InvalidOSException;
import uas.utils.CLIUtils;

public class DeviceView {

    private DeviceControllers deviceControllers;

    public DeviceView() {
        deviceControllers = new DeviceControllers();
    }

    public void render() {
        int menu = 0;
        try {
            do {
                System.out.println("Menu: ");
                System.out.println("1. Tambah device");
                System.out.println("2. Tampilkan semua device");
                System.out.println("3. Tampilkan semua device terurut berdasarkan OS");
                System.out.println("0. Keluar");
                menu = CLIUtils.getInt();
                CLIUtils.getString();

                if (menu == 0 || menu == 1 || menu == 2 || menu == 3) {
                    handleMenu(menu);
                } else {
                    throw new InvalidMenuException();
                }
            } while (menu != 0);
        } catch (InvalidMenuException e) {
            System.out.println(e.getMessage());
        }
    }

    private void handleMenu(int menu) {
        switch (menu) {
            case 1:
                addNewDevice();
                break;

            case 2:
                printAll();
                break;

            case 3:
                sortDevice();
                break;

            default:
                break;
        }
    }

    public void addNewDevice() {
        System.out.println("Masukkan nama pengguna: ");
        String name = CLIUtils.getString();

        System.out.println("Pilih OS: 1. Windows, 2. Ubuntu, 3. Fedora");
        int os = CLIUtils.getInt();
        try {
            if (os != 1 && os != 2 && os != 3) {
                throw new InvalidOSException();
            }
        } catch (InvalidOSException e) {
            System.out.println(e.getMessage());
        }
        CLIUtils.getString();

        System.out.println("Masukkan versi: ");
        String version = CLIUtils.getString();

        // Kalau Windows
        int type;
        if (os == 1) {
            System.out.println("Pilih Type Windows: 1. Pro, 2. Home, 3. Student");
            type = CLIUtils.getInt();
            CLIUtils.getString();
            deviceControllers.addNewDevice(name, os, version, type);
        }

        // Kalau Ubuntu
        String desktopEnvironmentName;
        if (os == 2) {
            System.out.println("Desktop Environment: ");
            desktopEnvironmentName = CLIUtils.getString();
            deviceControllers.addNewDevice(name, os, version, desktopEnvironmentName);
        }
    }

    public void printAll() {
        List<Device> devices = deviceControllers.getAllDevices();
        try {
            if (devices.isEmpty()) {
                throw new EmptyListException();
            }
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        for (Device device : devices) {
            System.out.println(device.getNameDevice() + " booted: " + device.getOperatingSystem().getBootInfo());
        }
    }

    public void sortDevice() {
        List<Device> devices = deviceControllers.getAllDevices();

        devices.sort(null);

        for (Device device : devices) {
            System.out.println(device.getNameDevice() + " booted: " + device.getOperatingSystem().getBootInfo());
        }
    }

}
