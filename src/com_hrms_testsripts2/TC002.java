package com_hrms_testsripts2;

import org.testng.annotations.Test;

import com_hrms_lib2.General2;

public class TC002 {

	//public static void main(String[] args) {
@Test
		public void tc002() {
			
		
General2 obj = new General2();
obj.openapplication();
obj.login();
obj.logut();
obj.closeapplication();
	}
}
