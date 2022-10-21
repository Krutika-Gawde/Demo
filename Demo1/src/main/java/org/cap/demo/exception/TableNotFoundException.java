package org.cap.demo.exception;

public class TableNotFoundException extends RuntimeException {
	public TableNotFoundException(String exceptionmessage){
		super(exceptionmessage);
}
}
