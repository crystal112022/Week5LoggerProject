package com.myapp.logger;

public class AsteriskLogger implements Logger {
	@Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        String errorMessage = "***Error: " + message + "***";
        int length = errorMessage.length();
        String border = "*".repeat(length);

        System.out.println(border);
        System.out.println(errorMessage);
        System.out.println(border);
    }

}
