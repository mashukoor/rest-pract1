package utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    static {
        String env = System.getProperty("env","qa");//default qa
        String fileName = "config-"+env+".properties";
        try{
            //InputStream inputStream = new FileInputStream("src/test/resources/config-qa.properties");
            InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream(fileName);
            properties = new Properties();
            properties.load(input);
        }catch (IOException e){
            throw new RuntimeException("Failed to load configuation properties");
        }
    }
    public static String get(String key){
        return properties.getProperty(key);
    }
}
