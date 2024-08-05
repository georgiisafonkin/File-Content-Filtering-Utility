import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements IReader {
    private String fileName;
    private BufferedReader dataReader;
    private Data filteredData;
    public FileReader(String fileName) {
        this.fileName = fileName;
        try {
            dataReader = new BufferedReader(new java.io.FileReader(fileName));
            filteredData = new Data();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); //TODO нормальная обработка исключения в случае, если указано неверное имя файла
        }
    }
    @Override
    public void readData() throws IOException {
        String line;
        while ((line = dataReader.readLine()) != null) {

        }
    }
}
