package com.Reflective.GenricUtils;

import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ReflectiveGenricUtils {

		
	
		public String dateMethod() {
		DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
		Date date=new Date();
		return(dateFormat.format(date));
		
		}
		
		//ReadMi -- this method is taking date 15 days from system dates. int days=15
		
		public String futureDate(int days) {
			DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
			Date date=new Date();
			
			//System.out.println(dateFormat.format(date));
			
			Calendar c=Calendar.getInstance();
			c.setTime(date);
		    c.add(Calendar.DATE, days);
		    Date d=c.getTime();
		    return(dateFormat.format(d));
		}
		
		public String readProperties(String key) throws IOException {
			FileReader reader=new FileReader("framework.properties");  
		      
		    Properties p=new Properties();  
		    p.load(reader);  
		    return p.getProperty(key);
		}
		
		public void impliciteWait() {
			Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

}
