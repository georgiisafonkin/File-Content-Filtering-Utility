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
            System.out.println(el);
            FileReader fr = new FileReader(el.toString());
            try {
                fr.readData();
            } catch (IOException e) {
                throw new RuntimeException(e); //TODO нормальная обработка исключений
            }
            DataFilter df = new DataFilter(fr.getData().getStringList()); //TODO не очень аккуратно
            df.filter();
            FileWriter fw = new FileWriter(df.getData());
            fw.writeData();
            try {
                fr.readData();

            } catch (IOException e) {
                throw new RuntimeException(e); //TODO нормальная обработка исключений
            }
        }
    }
}
