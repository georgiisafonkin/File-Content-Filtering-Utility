import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main { //options: -o, -p, -a, -s, -f
    public static void main(String[] args) {
        List<String> options = new ArrayList<>();
        List<String> fileNames = new ArrayList<>();
        List<String> other = new ArrayList<>();
        String path = "";
        String prefix = "";
        boolean appendMode = false;
        //cmd input parsing
        for (String word: args) {
            if (word.matches("-([a-zA-Z])")) {
                options.add(word);
            }
            else if (word.matches("([a-zA-Z0-9_]+\\.txt)")) {
                fileNames.add(word);
            }
            else {
                other.add(word);
            }
        }

        StatisticsModes statisticsMode = StatisticsModes.NONE;
        //checking flags
        for (String option: options) {
            switch (option) {
                case "-s":
                    statisticsMode = StatisticsModes.SHORT;
                    break;
                case "-f":
                    statisticsMode = StatisticsModes.FULL;
                    break;
                case "-o":
                    break;
                case "-p":
                    break;
                case "-a":
                    appendMode = true;
                    break;
                default:
                    break;
            }
        }
        //preparation
        StatisticsHandler statisticsHandler = StatisticsHandlers.newStatisticHandler(statisticsMode);
        DataHandler dataHandler = new FileDataHandler(fileNames, new RegExFilter(new FileOutputWriter(path, prefix, appendMode), statisticsHandler));
        dataHandler.handle();
        switch (statisticsMode) {
            case NONE:
                break;
            default:
                System.out.println(statisticsHandler.statistics());
                break;
        }
    }
}
