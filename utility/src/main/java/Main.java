import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList(args);
        System.out.println(elements);
        for(String el : elements) {
            System.out.println(el);

        }
    }
}
