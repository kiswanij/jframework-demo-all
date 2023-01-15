package com.app.exception;

import com.jk.core.util.JK;

public class ExceptionExample1 {
	public static void main(String[] args) {
		//Throw null pointer exception and handle with default handler, which log the error then through runtime exception
		try {
			String name = null;
			name.length();
		} catch (Exception e) {
			JK.handle(e);
		}
	}
}
