package utility;

import java.util.logging.Logger;

import org.w3c.dom.DOMConfiguration;

public class Log {
	 private static Logger Log = Logger.getLogger(Log.class.getName());
	 
	 public static void startTestCase(String sTestCaseName){
		 Log.info("************************************");
		 Log.info("@@@@@@@@@@"+sTestCaseName+"@@@@@@@@@@");
		 Log.info("************************************");
	 }
	 
	 public static void endTestCase(String sTestCaseName){
		 Log.info("************"+"END"+"*******************");
	 }
	 
	 public static void info(String message){
		 Log.info(message);
		 
	 }
	 
	 public static void warn(String message){
		 Log.warning(message);
	 }
	 
	
}