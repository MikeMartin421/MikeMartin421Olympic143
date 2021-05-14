package student.lab.trycatch;

import javax.management.BadStringOperationException;

public class MyException extends Exception {
	private Exception exception; 
	private String message;
	public MyException(Exception exception, String message) {
		this.exception = exception;
		this.message = message;
        
    }
	public Exception getException() {
		return exception;
	}
	public void setException(Exception exception) {
		this.exception = exception;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
	
	
