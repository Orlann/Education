package ua.edu.lnu.financial.exceptions;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    WrongPasswordException(final String message) {
        super(message);
    }
}
