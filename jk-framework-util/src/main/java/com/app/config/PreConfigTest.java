package com.app.config;

import com.jk.core.config.JKConfig;
import com.jk.core.util.JK;

public class PreConfigTest {
	public static void main(String[] args) {
		JK.print(JKConfig.get().toProperties());
	}
}
