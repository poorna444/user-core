package com.practice.usercore.helper;

public class UtilValidate {
	
	public static boolean isNotEmpty(String data) {
		if(data != null && data.trim().length() > 0) {
			return true;
		}
		return false;
	}

}
