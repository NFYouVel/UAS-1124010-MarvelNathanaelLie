package quiz3.utils;

import java.util.Scanner;

import quiz3.models.InvalidInputException;

public class CLIUtil {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static int getInt() {
        return sc.nextInt();
    }
}