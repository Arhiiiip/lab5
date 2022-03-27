package utility;

import java.io.*;

public class CreateFileForWork {

    public File creatFile(String link) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(link)));
//        String x = reader.readLine();
        File file = new File(link);
        return file;
    }
}
