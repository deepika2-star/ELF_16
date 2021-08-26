package genericLibrary;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class PropertyFileUtil extends BaseClass{

	public void readPropertyFile(String filepath, String key) throws Exception {


		File absPath = new File(filepath);
		FileInputStream fis = new FileInputStream(absPath);

		Properties properties = new Properties();
		properties.load(fis);
		properties.getProperty(key);

	}

}





