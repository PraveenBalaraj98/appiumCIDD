package com.qa.nobero.genericutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Praveen B
 */
public class JavaUtility {

	/**
	 * its used to generate the random number with in the range 
	 * @return
	 */
	public String getRanDomNumber(int range) {
		Random ranDom = new Random();
		int ranDomNum =  ranDom.nextInt(range);
		String randomInteger = Integer.toString(ranDomNum);
		return randomInteger;

	}
	/**
	 *  its used to get the current system date based on YYYY-MM-DD format
	 * @return
	 */
	public String  getSystemDateInYYYYMMDD() {
		Date date = new Date();
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");

		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;

		String formate = yyyy+"-"+mm+"-"+dd;
		return formate;
	}
	/**
	 *  its used to get the current system date based on DD-MM-YYYY format 
	 * @return
	 */
	public  String  getSystemDateInDDMMYYYY() {
		Date date = new Date();
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");

		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;

		String formate = dd+"-"+mm+"-"+yyyy;
		return formate;
	}
	/**
	 *  its used to get the current system date based on MM-DD-YYYY format
	 * @return
	 */
	public String  getSystemDateInMMDDYYYY() {
		Date date = new Date(0);
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");

		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;

		String formate = mm+"-"+dd+"-"+yyyy;
		return formate;
	}

	public static String  getSystemDateTime() {
		Date date = new Date();
		String currentDate = date.toString();
		//System.out.println(currentDate);
		String[] arr = currentDate.split(" ");
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;
		String time = arr[3].replace(":", "");
		String formate = dd+mm+yyyy+time;
		return formate;

	}


	public int returnNumber(String priceSTR) {
		int numberValue;
		String conc="";
		for (int i = 0; i < priceSTR.length(); i++) {
			if (priceSTR.charAt(i)>=48 || priceSTR.charAt(i)<=57) {
				conc=conc+priceSTR.charAt(i);
			}	
		}
		numberValue = Integer.parseInt(conc);
		System.out.println(numberValue);
		return numberValue;


	}
	
	  public int extractNumbers(String input) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (Character.isDigit(c)) {
	                sb.append(c);
	            }
	        }
	        int num = Integer.parseInt(sb.toString());
	        return num;
	    }
	  public float extractAmount(String input) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (Character.isDigit(c) || c=='.') {
	                sb.append(c);
	            }
	        }
	        float num = Float.parseFloat(sb.toString());
	        return num;
	    }
	 
}
