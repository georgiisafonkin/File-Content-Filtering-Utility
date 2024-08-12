import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputWriter implements OutputWriter {
    private String stringOutputName = "strings.txt";
    private String integerOutputName = "integers.txt";
    private String floatOutputName = "floats.txt";
    private String path;
    private String prefix;
    private final BufferedWriter stringsWriter;
    private  final BufferedWriter integersWriter;
    private  final BufferedWriter floatWriter;
    private boolean fileCreationFlag = false; //flag to show if File Writer created files for output or not
    public FileOutputWriter(String path, String prefix, boolean appendMode) throws IOException {
        this.path = path;
        this.prefix = prefix;
        stringsWriter = new BufferedWriter(new FileWriter(this.path + this.prefix + stringOutputName, appendMode));
        integersWriter = new BufferedWriter(new FileWriter(this.path + this.prefix + integerOutputName, appendMode));
        floatWriter = new BufferedWriter(new FileWriter(this.path + this.prefix + floatOutputName, appendMode));
    }
    @Override
    public void writeInt(String intVal) {
        try {
            integersWriter.write(intVal + "\n");
            integersWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing the data.\n" + e + ".");
        }
    }

    @Override
    public void writeFloat(String floatVal) {
        try {
            floatWriter.write(floatVal + "\n");
            floatWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing the data.\n" + e + ".");
        }
    }

    @Override
    public void writeStr(String strVal) {
        try {
            stringsWriter.write(strVal + "\n");
            stringsWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing the data.\n" + e + ".");
        }
    }
}
