import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileClass {

 public static Properties fileReader(String filepath) throws IOException {
     File file=new File(System.getProperty(("user.dir") + filepath));
     FileInputStream file_input=null;
     file_input=new FileInputStream(file);
     Properties prop=new Properties();
     prop.load(file_input);
     return  prop;



 }
}
