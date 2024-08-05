public class FileWriter implements IWriter {
    private String stringOutputName = "strings.txt";
    private String integerOutputName = "integers.txt";
    private String floatOutputName = "floats.txt";
    private Data dataToWrite;
    public FileWriter(String prefix, Data data) {
        this(data);
        stringOutputName = prefix + stringOutputName;
        integerOutputName = prefix + integerOutputName;
        floatOutputName = prefix + floatOutputName;
    }
    public FileWriter(Data data) {
        dataToWrite = data;
    }

    @Override
    public void writeData() {

    }
}
