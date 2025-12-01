package uas.utils;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import uas.models.Device;
import uas.models.OperatingSystem;
import uas.models.exceptions.InvalidMenuException;

public class CLIUtils {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static int getInt() {
        return sc.nextInt();
    }
    public static String getString() {
        return sc.nextLine();
    }
    public static boolean getBoolean() {
        return sc.nextBoolean();
    }

//     public int compare(Object obj1, Object obj2) {
//     // Make sure that the objects are Car objects
//     OperatingSystem a = (OperatingSystem) obj1;
//     OperatingSystem b = (OperatingSystem) obj2;
    
//     // Compare the year of both objects
//     if (a.getVersion().compareTo(b.getVersion())) return -1; // The first car has a smaller year
//     if (a.getVersion() > b.getVersion()) return 1;  // The first car has a larger year
//     return 0; // Both cars have the same year
//   }
}