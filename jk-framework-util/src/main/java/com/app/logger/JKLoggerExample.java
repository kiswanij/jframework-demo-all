package com.app.logger;

import com.jk.core.logging.JKLogger;
import com.jk.core.logging.JKLoggerFactory;

public class JKLoggerExample {
	public static void main(String[] args) {
		JKLogger logger=JKLoggerFactory.getLogger(JKLoggerExample.class);
		String value="Dummy value";
		logger.trace("Print trace message with value {}", value);
		logger.debug("Print debug message with value {}", value);
		logger.info("Print info message with value {}", value);
		logger.error("Print error message with value {}", value);
	}
}
