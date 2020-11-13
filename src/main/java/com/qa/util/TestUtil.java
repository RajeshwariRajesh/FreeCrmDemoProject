package com.qa.util;

import java.util.Iterator;
import java.util.Set;

import com.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static int Implicit_wait_time = 20;

	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public void switchtowindow(String ParentWindow) {
		Set<String> openwindows = driver.getWindowHandles();
		Iterator<String> it = openwindows.iterator();
		while (it.hasNext()) {
			String id = driver.getWindowHandle();

			if (!ParentWindow.equals(id)) {
				driver.switchTo().window(id);

				break;
			}
		}
		
	}
}
