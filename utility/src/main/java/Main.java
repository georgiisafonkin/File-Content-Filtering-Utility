import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(Arrays.toString(args));
        System.out.println(stringBuilder.toString());
        Arrays.asList(stringBuilder);
    }
}
