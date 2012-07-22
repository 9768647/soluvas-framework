package org.soluvas.push.data;

/**
 * Unchecked exception thrown by {@link SyncRepository} implementations.
 * @author ceefour
 */
@SuppressWarnings("serial")
public class RepositoryException extends RuntimeException {

	public RepositoryException() {
		super();
	}

	public RepositoryException(String message, Throwable cause) {
		super(message, cause);
	}

	public RepositoryException(String message) {
		super(message);
	}

	public RepositoryException(Throwable cause) {
		super(cause);
	}

}
