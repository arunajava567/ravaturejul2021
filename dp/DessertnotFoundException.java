package com.revature.sre.day5.dp;


//Good practice to throw an exception if the desired concrete instance is not found
public class DessertnotFoundException extends RuntimeException
{
	DessertnotFoundException(String msg)
    {super(msg);
    }
}

//Factory class that returns the concrete instance