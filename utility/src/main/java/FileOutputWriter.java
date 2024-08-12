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
    private boolean appendMode;
    private BufferedWriter stringsWriter = null;
    private BufferedWriter integersWriter = null;
    private BufferedWriter floatWriter = null;
    private boolean fileCreationFlag = false; //flag to show if File Writer created files for output or not
    public FileOutputWriter(String path, String prefix, boolean appendMode) throws IOException {
        this.path = path;
        this.prefix = prefix;
        this.appendMode = appendMode;
//        stringsWriter = new BufferedWriter(new FileWriter(path + prefix + stringOutputName, appendMode));
//        integersWriter = new BufferedWriter(new FileWriter(path + prefix + integerOutputName, appendMode));
//        floatWriter = new BufferedWriter(new FileWriter(path + prefix + floatOutputName, appendMode));
    }
    @Override
    public void writeInt(String intVal) {
        if (integersWriter == null) {
            try {
                integersWriter = new BufferedWriter(new FileWriter(path + prefix + integerOutputName, appendMode));
            } catch (IOException e) {
                throw new RuntimeException("Something went wrong while creating the FileOutputWriter.\n" + e + ".");
            }
        }
        try {
            integersWriter.write(intVal + "\n");
            integersWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing the data.\n" + e + ".");
        }
    }

    @Override
    public void writeFloat(String floatVal) {
        if (floatWriter == null) {
            try {
                floatWriter = new BufferedWriter(new FileWriter(path + prefix + floatOutputName, appendMode));
            } catch (IOException e) {
                throw new RuntimeException("Something went wrong while creating the FileOutputWriter.\n" + e + ".");
            }
        }
        try {
            floatWriter.write(floatVal + "\n");
            floatWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing the data.\n" + e + ".");
        }
    }

    @Override
    public void writeStr(String strVal) {
        if (stringsWriter == null) {
            try {
                stringsWriter = new BufferedWriter(new FileWriter(path + prefix + stringOutputName, appendMode));
            } catch (IOException e) {
                throw new RuntimeException("Something went wrong while creating the FileOutputWriter.\n" + e + ".");
            }
        }
        try {
            stringsWriter.write(strVal + "\n");
            stringsWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing the data.\n" + e + ".");
        }
    }
}
