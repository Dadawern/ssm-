package com.dadawern.exception;



//������û��Լ������쳣
public class NoNumberException extends RuntimeException{

	public NoNumberException(String message)
	{
		super(message);
	}
	
	public NoNumberException(String message,Throwable cause)
	{
		super(message,cause);
	}
}
