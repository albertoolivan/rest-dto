package org.adidas.code.challange.rest.dto;

import java.io.PrintWriter;
import java.io.StringWriter;

public class RestStringUtil {
	
	/**
	 * Enter Exception and convert into readable string.
	 * 
	 * @param e
	 * @return String
	 */
	public static String stack2string(Exception e) {
		try {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			return sw.toString();
		} catch (Exception e2) {
			return "bad stack2string of " + e;
		}
	}

}
