package com.mini_project_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Mini_Project_Dec.Base_Class;
import com.pom_1.Book_Hotel;
import com.pom_1.Booking_Confrom;
import com.pom_1.Home_Page_1;
import com.pom_1.Search_Hotel;
import com.pom_1.Select_Hotel;
import com.pom_2.Page_Object_Manager_2;

public class Runner_Class_2 extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Page_Object_Manager_2 pom = new Page_Object_Manager_2(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		url("https://adactinhotelapp.com/");

		thread(5000);

		inputValueElement(pom.getHp().getElement1(), "tamilselvanv3108");

		inputValueElement(pom.getHp().getElement2(), "9025427764");

		clickOnElement(pom.getHp().getclick1());

		dropdown("value", pom.getSh().getElement3(), "London");

		dropdown("index", pom.getSh().getElement4(), "2");

		dropdown("text", pom.getSh().getElement5(), "Standard");

		dropdown("value", pom.getSh().getElement6(), "4");

		inputValueElement(pom.getSh().getElement7(), "13/12/2021");

		inputValueElement(pom.getSh().getElement8(), "14/12/2021");

		dropdown("value", pom.getSh().getElement9(), "1");

		dropdown("value", pom.getSh().getElement10(), "3");

		clickOnElement(pom.getSh().getClick2());

		clickOnElement(pom.getShl().getClick3());

		clickOnElement(pom.getShl().getElement11());

		inputValueElement(pom.getBh().getElement12(), "tamil");

		inputValueElement(pom.getBh().getElement13(), "selvan");

		inputValueElement(pom.getBh().getElement14(), "nehru nagar,acharapakkam");

		inputValueElement(pom.getBh().getElement15(), "2323555456655778");

		dropdown("text", pom.getBh().getElement16(), "American Express");

		dropdown("value", pom.getBh().getElement17(), "9");

		dropdown("text", pom.getBh().getElement18(), "2021");

		inputValueElement(pom.getBh().getElement19(), "3104");

		clickOnElement(pom.getBh().getClick4());

		thread(15000);

		screenshot("C:\\Users\\KATHIR\\Desktop\\desktop\\Testing\\Screenshots\\pic5.png");

		clickOnElement(pom.getBc().getClick5());

		screenshot("C:\\Users\\KATHIR\\Desktop\\desktop\\Testing\\Screenshots\\pic6.pn");

	}
}
