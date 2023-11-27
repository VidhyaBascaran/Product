package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



/**
 * @author Vidhya
 * @see This class is to creating report for the OMR Branch Hotel 
 * @since 20-05-23
 */

public class Reporting {
	
	
	
	
	/**
	 * @author Vidhya
	 * @see This method  is to generating report in json file
	 * @param jsonfile Json File should be passed as s String
	 * @since 20-05-23
	 */
	
	public static  void generateJvmReport(String jsonFile) {
		
		String path=System.getProperty("user.dir");
		System.out.println(path);
		File file=new File(path+"\\target");
		
		Configuration confi=new Configuration(file,"OMRBranch Hotel Automation");
		confi.addClassifications("Browser", "Chrome");
		confi.addClassifications("Browser","Version 113");
		confi.addClassifications("OS","WIN11");
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder=new ReportBuilder(jsonFiles,confi);
		builder.generateReports();
				
	
	
	
		
	
	}

}
