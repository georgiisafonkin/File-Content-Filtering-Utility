import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(Arrays.toString(args));
        System.out.println(stringBuilder.toString());
        List<String> elements = Arrays.asList(String.valueOf(stringBuilder));
        for(String el : elements) {
            FileReader fr = new FileReader(el);
            try {
                fr.readData();

            } catch (IOException e) {
                throw new RuntimeException(e); //TODO нормальная обработка исключений
            }
        }
    }
}
