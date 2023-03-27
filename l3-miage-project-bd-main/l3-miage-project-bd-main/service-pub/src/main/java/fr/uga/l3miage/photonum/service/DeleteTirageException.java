package fr.uga.l3miage.photonum.service;

/**
 * Thrown when an author cannot be deleted
 */
public class DeleteTirageException extends Exception {

    public DeleteTirageException(String message) {
        super(message);
    }

    public DeleteTirageException(String message, Throwable cause) {
        super(message, cause);
    }
    
}