package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {
	
	public static void generateJVMReport(String json){
		
		File file = new File ("C:\\Users\\LENOVO\\eclipse-workspace\\MavenDemo\\target");
		
		Configuration configuration = new Configuration(file, "23-08-2023");
		
		configuration.addClassifications("platform", "Win-11");
		configuration.addClassifications("Browser", "Chrome 116");
		configuration.addClassifications("SprintNO", "5");
		configuration.addClassifications("Author", "GreenTechnology");	
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li,configuration);
		builder.generateReports();
		

}
}