package com.media.exception;

public class MediaException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 6596385261286232441L;

	public MediaException() {
		super();
	}

	public MediaException(String message) {
		super(message);
	}

	public MediaException(String message, Throwable cause) {
		super(message, cause);
	}

	public MediaException(Throwable cause) {
		super(cause);
	}

}
