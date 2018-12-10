package ua.edu.lnu.financial.exceptions;

public class WrongLoginException extends Exception {
    WrongLoginException() {
    }

    WrongLoginException(final String message) {
        super(message);
    }
}
