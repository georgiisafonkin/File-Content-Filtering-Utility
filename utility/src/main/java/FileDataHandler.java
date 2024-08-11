import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileDataHandler implements DataHandler{
    private List<String> fileNames;
    private DataFilter dataFilter;
    public FileDataHandler(List<String> fileNames, DataFilter dataFilter) {
        this.fileNames = fileNames;
        this.dataFilter = dataFilter;
    }
    public void handle() {
        for (String fileName : fileNames) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((((line = bufferedReader.readLine()) != null))) {
                    System.out.println(Thread.currentThread().getName() + "read \"" + line +"\"");
                    dataFilter.filter(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("There is no file with the name " + fileName + ". We continue...\n");
            } catch (IOException e) {
                throw new RuntimeException("Something went wrong while reading the data.\n Reason: " + e + ".");
            }
        }
    }
    public void setFileNames(List<String> fileNames) {
        this.fileNames = fileNames;
    }
}
