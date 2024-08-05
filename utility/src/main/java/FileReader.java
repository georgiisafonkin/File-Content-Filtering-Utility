import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements IReader {
    private String fileName;
    private BufferedReader dataReader;
    private List<String> stringList;
    private List<Integer> integerList;
    private List<Float> floatList;

    public FileReader(String fileName) {
        this.fileName = fileName;
        try {
            dataReader = new BufferedReader(new java.io.FileReader(fileName));
            stringList = new ArrayList<>();
            integerList = new ArrayList<>();
            floatList = new ArrayList<>();
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
