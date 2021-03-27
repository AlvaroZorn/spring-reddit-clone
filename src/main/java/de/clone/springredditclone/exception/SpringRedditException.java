package de.clone.springredditclone.exception;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
