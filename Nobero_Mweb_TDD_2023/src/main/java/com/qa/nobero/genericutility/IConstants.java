package com.qa.nobero.genericutility;

import java.time.Duration;

/**
 * @author Praveen B
 *
 */
public interface IConstants {

	String EXCELPATH = "./testdata/excelFile/NoberoTestData.xlsx";
	
	String qaCapablityProprtyFile = "./propertyFile/qa.capabilities.properties";

	Duration Explicitly_TIMEOUT = Duration.ofSeconds(20);
	Duration Implicitly_TIMEOUT = Duration.ofSeconds(20);

	String qaURLPropertyFilePath = "./propertyFile/qa.url.properties";
	String excelPath = "./testdata/excelFile/NoberoTestData.xlsx";
	
	String qaUserRegistrationProprtyFile = "./propertyFile/qa.UserRegistration.properties";
	
	int retryValue = 1;
}
