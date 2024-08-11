import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class FileDataHandler implements DataHandler{
    private List<String> fileNames;
    private BufferedReader dataReader;
    private DataFilter dataFilter;
    public FileDataHandler(DataFilter dataFilter, List<String> fileNames) {
        this.dataFilter = dataFilter;
        this.fileNames = fileNames;
    }
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
    public void setFileNames(List<String> fileNames) {
        this.fileNames = fileNames;
    }
}
