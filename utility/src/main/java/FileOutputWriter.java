import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputWriter implements OutputWriter {
    private String stringOutputName = "strings.txt";
    private String integerOutputName = "integers.txt";
    private String floatOutputName = "floats.txt";
    private boolean fileCreationFlag = false; //flag to show if File Writer created files for output or not
    public FileOutputWriter(String prefix) {
        stringOutputName = prefix + stringOutputName;
        integerOutputName = prefix + integerOutputName;
        floatOutputName = prefix + floatOutputName;
    }

    @Override
    public void writeInt(String intVal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(integerOutputName, true))) {
            writer.write(intVal);
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing the data.\n Reason: " + e + ".");
        }
    }

    @Override
    public void writeFloat(String floatVal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(floatOutputName, true))) {
            writer.write(floatVal);
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing the data.\n Reason: " + e + ".");
        }
    }

    @Override
    public void writeStr(String strVal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(stringOutputName, true))) {
            writer.write(strVal);
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing the data.\n Reason: " + e + ".");
        }
    }
}
