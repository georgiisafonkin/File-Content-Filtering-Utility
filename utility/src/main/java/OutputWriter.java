import java.io.FileWriter;
import java.io.IOException;

public class OutputWriter implements IWriter {
    private String stringOutputName = "strings.txt";
    private String integerOutputName = "integers.txt";
    private String floatOutputName = "floats.txt";
    private Data dataToWrite;
    private boolean fileCreationFlag = false; //flag to show if File Writer created files for output or not
    public OutputWriter(String prefix, Data data) {
        this(data);
        stringOutputName = prefix + stringOutputName;
        integerOutputName = prefix + integerOutputName;
        floatOutputName = prefix + floatOutputName;
    }
    public OutputWriter(Data data) {
        dataToWrite = data;
    }

    @Override
    public void writeData() {
        if (fileCreationFlag == false) {
            try (FileWriter stringFW = new FileWriter(stringOutputName);
                 FileWriter integerFW = new FileWriter(integerOutputName);
                 FileWriter floatFW = new FileWriter(floatOutputName);) {

                for (String str : dataToWrite.getStringList()) {
                    stringFW.write(str + "\n");
                }

                for (Integer integer : dataToWrite.getIntegerList()) {
                    integerFW.write(String.valueOf(integer) + "\n");
                }

                for (Float floating : dataToWrite.getFloatList()) {
                    floatFW.write(String.valueOf(floating) + "\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e); //TODO норм обработка
            }

        }
    }

    @Override
    public Data getData() {
        return null;
    }
}
