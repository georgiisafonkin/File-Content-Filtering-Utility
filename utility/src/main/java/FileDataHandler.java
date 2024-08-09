import java.io.BufferedReader;
import java.io.IOException;

public class FileDataHandler implements DataHandler{
    private String fileName;
    private BufferedReader dataReader;
    private RegExFilter dataFilter;
    public void handle() {
        String line;
        while (true) {
            try {
                if (((line = dataReader.readLine()) == null)) break;
            } catch (IOException e) {
                throw new RuntimeException("Something went wrong while reading the data.\n Reason: " + e + ".");
            }
            System.out.println(Thread.currentThread().getName() + "read \"" + line +"\"");
            dataFilter.filter(line);
        }
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
