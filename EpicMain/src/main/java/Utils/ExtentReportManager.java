package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

public class ExtentReportManager {
	
	 //static variable
	 public static ExtentReports report;
	 
	 public static ExtentReports getReportInstance(){
		 if( report ==null ){
			 
			 //report location
			 ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//testreport.html"); 
			 report = new ExtentReports();
			 report.attachReporter(htmlreporter);
			 
			 //Setting system info
			 report.setSystemInfo("OS", "Windows 10");
			 
			 //Configuring report
			 htmlreporter.config().setDocumentTitle("Results");
			 htmlreporter.config().setReportName("Test Report");
			 htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
			 htmlreporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
		 }
		 
		 return report;
	 }

}
