package com_hrms_testsripts2;

import org.testng.annotations.Test;

import com_hrms_lib2.General2;

public class TC001 {

	//public static void main(String[] args) throws InterruptedException    {
	
	
	
	@Test
	public void tc001() throws InterruptedException {
		
General2 obj = new General2();
obj.openapplication();
obj.login();
obj.pimmouseover();
obj.enterframe();
obj.employeinformation();
obj.exitfame();
obj.logut();
obj.closeapplication();
	}

}
