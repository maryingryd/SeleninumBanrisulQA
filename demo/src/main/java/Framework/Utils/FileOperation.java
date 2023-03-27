package Framework.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FileOperation {
    // user.dir é a raiz do projeto
    private static final String DIR_PATH_PROPETIES = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
            + "resources" + File.separator + "Properties" + File.separator;

    public static Properties getProperties(String fileName) {
        InputStream inputStream = null;
        Properties prop = new Properties();

        try {
            File file = new File(DIR_PATH_PROPETIES + fileName + ".properties");
            inputStream = new FileInputStream(file);
            prop.load(inputStream);
        } catch (Exception e) {
            System.out.println("Não foi possível carregar o arquivo de propriedade");
        }
        return prop;
    }

    public static void setProperties(String fileName, String propkey, String propValue) {
        Properties prop = getProperties(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(DIR_PATH_PROPETIES + fileName + ".properties");
            prop.setProperty(propkey, propValue);
            prop.store(outputStream, null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
