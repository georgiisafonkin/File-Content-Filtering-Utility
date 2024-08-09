import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList(args);
        System.out.println(elements);
        for(String el : elements) {
            System.out.println(el);

            //
            // TODO обработка ключей при запуске команды
            //

//            FileReader fr = new FileReader(el.toString());
//            try {
//                fr.readData();
//            } catch (IOException e) {
//                throw new RuntimeException(e); //TODO нормальная обработка исключений
//            }
//            RegExFilter df = new RegExFilter(fr.getData().getStringList()); //TODO не очень аккуратно
//            df.filter();
//            FileOutputWriter fw = new FileOutputWriter(df.getData());
//            fw.writeData();
//            try {
//                fr.readData();
//            } catch (IOException e) {
//                throw new RuntimeException(e); //TODO нормальная обработка исключений
//            }
        }
    }
}
