package com.qa.nobero.genericutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
	{
	    int retry=IConstants.retryValue;
	    public boolean retry(ITestResult iTestResult) {
	        if(retry>=0)
	        {
	            retry--;
	            return  true;
	        }
	        return false;
	    }
	}
