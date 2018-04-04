/**
 * 
 */
package baseFile;

import org.openqa.selenium.WebDriver;
import utils.SeleniumBaseFile;
import utils.SeleniumUtils;
import utils.SeleniumWait;

import java.util.Properties;


public class BaseFile {

	public static SeleniumBaseFile selenium = SeleniumBaseFile.getInstance();
	public static WebDriver web_driver = selenium.sharedDriver();
	public static Properties or_ = selenium.object_Repository;
	public static Properties config_ = selenium.configurations_File;
	public static SeleniumUtils seleniumUtils = new SeleniumUtils();
	public static SeleniumWait seleniumWait = new SeleniumWait();



}
