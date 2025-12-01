package uas.models.exceptions;

public class EmptyListException extends Exception{
    public EmptyListException() {
        super("Daftar device kosong\n-------------------");
    }
}
