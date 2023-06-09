package com.qa.nobero.genericutility;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ConfigCapability {
	static FileUtility fileUtil = new FileUtility();
	public static void startAppiumServer(AppiumDriverLocalService server) throws NumberFormatException, Throwable {
		int port = Integer.parseInt(fileUtil.getPropertyKeyValue("portNo", IConstants.qaCapablityProprtyFile));
		server = AppiumDriverLocalService.buildService
				(new AppiumServiceBuilder().usingPort(port).usingDriverExecutable(new File(fileUtil.getPropertyKeyValue("NodejsPath", IConstants.qaCapablityProprtyFile))));
		server.start();
	}
}
