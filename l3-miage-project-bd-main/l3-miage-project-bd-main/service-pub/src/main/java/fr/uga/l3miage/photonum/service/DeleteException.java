package fr.uga.l3miage.photonum.service;

/**
 * Thrown when an author cannot be deleted
 */
public class DeleteException extends Exception {

    public DeleteException(String message) {
        super(message);
    }

    public DeleteException(String message, Throwable cause) {
        super(message, cause);
    }

}
