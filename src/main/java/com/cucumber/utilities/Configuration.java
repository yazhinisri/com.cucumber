package com.cucumber.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static Properties prop = new Properties();

	public Configuration() throws IOException {
		File f = new File(System.getProperty("user.dir")
				+ "\\src\\test\\resource\\com\\cucumber\\drivers\\Configuration.properties");
       FileInputStream fis=new FileInputStream(f);
       prop.load(fis);
	}
	public String getBrowsername() {
		String browser=prop.getProperty("browsername");
		return browser;
		
	}
	public String getURL() {
		String url=prop.getProperty("url");
		return url;
		
	}
	public String getWait() {
		String waitSec=prop.getProperty("implicitwait");
		return waitSec;
		
	}

}
