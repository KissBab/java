import org.apache.log4j.Logger;
import java.util.Scanner;
import java.io.File;
import java.io.FilenameFilter;

class wordFilter implements FilenameFilter{
    final static Logger logger=Logger.getLogger(Main.class);

    @Override
    public boolean accept(File dir, String name) {
        String searchKey = "test";
        logger.info("შემოტანილი სიტყვაა: " + searchKey);
        if (name.toLowerCase().startsWith(searchKey.toLowerCase())) {
            return true;
        }else {
            return false;
        }
    }
}

public class Main {

    final static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Desktop\\test_dir");
        String[] fileNames = file.list(new wordFilter());
        for (String fileName : fileNames) {
            logger.info("მოიძებნა " + fileName);
        }
    }
}
