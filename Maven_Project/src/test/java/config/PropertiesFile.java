package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties prop= new Properties();

	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties()
	{
		try{

			InputStream input= new FileInputStream("C:\\Users\\BS784\\OneDrive\\Documents\\Automation\\Maven_Project\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
		}
		catch(Exception exp)
		{
			System.out.println("Msg: "+ exp.getMessage());
			System.out.println("Cause: "+ exp.getCause());
			exp.printStackTrace();
		}
	}
	public static void setProperties()
	{
		try{

			OutputStream out= new FileOutputStream("C:\\Users\\BS784\\OneDrive\\Documents\\Automation\\Maven_Project\\src\\test\\java\\config\\config.properties");
            prop.setProperty("browser", "Chrome");
			prop.store(out, null);

		}
		catch(Exception exp)
		{
			System.out.println("Msg: "+ exp.getMessage());
			System.out.println("Cause: "+ exp.getCause());
			exp.printStackTrace();
		}
	}



}
