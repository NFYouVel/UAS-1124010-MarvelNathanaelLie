package uas.models.exceptions;

public class InvalidOSException extends Exception{
    public InvalidOSException() {
        super("Salah pilih operating system: ");
    }
}