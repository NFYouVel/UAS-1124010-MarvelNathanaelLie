package uas.utils;

import java.util.Scanner;

public class CLIUtil {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static int getInt() {
        return sc.nextInt();
    }
}