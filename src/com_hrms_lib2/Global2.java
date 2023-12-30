package com_hrms_lib2;
import org.openqa.selenium.WebDriver;
public class Global2 {
//provide to test data and objects or elements whole application
	 public WebDriver driver;
	public String url  = "http://183.82.103.245/nareshit/login.php";
	public String username = "nareshit";
	public String password = "nareshit";
	public String lastname = "makka";
	public String firstname = "bhaskar";
	//objects Elements
	public String txt_loginname  = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login   = "Submit";
	public String btn_addemploye   = "Add Employee";
	public String frame_employeinfo = "rightMenu";
	public String Emplastname     ="//input[@name='txtEmpLastName']";
	public String  Empfirstname    = "txtEmpFirstName";
	public String btn_save         ="btnEdit";
	public String link_logout      ="Logout";
}
