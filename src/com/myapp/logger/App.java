package com.myapp.logger;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test AsteriskLogger
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        // Test SpacedLogger
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");

	}

}
