package com.dadawern.exception;



//此男生没有约会次数异常
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
