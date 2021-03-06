package com.scholasticlearningzone.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TeacherReader {

	WebDriver driver;
	
	//#1
	public void settingReader()
	{
		driver.findElement(By.id("settingsImg")).click();
		//click on setting in the reader
	}
	
	//#2
	public void rightReaderNavigator()
	{
		driver.findElement(By.xpath("//div[@id='page-right-button']/img")).click();
		//right navigator
	}
	
	//#3
	public void pageJump()
	{
		driver.findElement(By.id("jumpToPage")).sendKeys("30");
		driver.findElement(By.id("jumpToPage")).sendKeys(Keys.RETURN);
		//jump to page
	}
	
	//#4
	public void doublePageRadioButton()
	{
		driver.findElement(By.xpath("//div[@id='viewType']/div/div[2]/label")).click();
		//double page radio button
	}
	
	//#5
	public void singlePageRadioButton()
	{
		driver.findElement(By.xpath("//div[@id='viewType']/div/div[1]/label")).click();
		//double page radio button
	}
	
	//#6
	public void leftReaderNavigator()
	{
		driver.findElement(By.id("//div[@id='page-left-button']/img")).click();
		 //left navigator arrow
	}
	
	//#7
	public void reset()
	{
		driver.findElement(By.id("playbackRate")).click();
		//reset
	}
	
	//#8
	public void audioSpeed()
	{
		driver.findElement(By.xpath("//div[@id='playbackrateslider']/a")).click();
		//audio speed
	}
	
	//#9
	public void readAloud()
	{
		driver.findElement(By.id("readAloudElement")).click();
		//read aloud
	}
	
	//#10
	public void volume()
	{
		driver.findElement(By.id("changeVolumeIcon")).click();
		//volume
	}
	
	//#11
	public void maximizePage()
	{
		driver.findElement(By.id("full-screen-btn")).click();
		//maximize (popup handling)
	}
	
	
}
