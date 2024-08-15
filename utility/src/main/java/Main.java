import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fileNames = new ArrayList<>();
        String path = "";
        String prefix = "";
        boolean appendMode = false;
        StatisticsModes statisticsMode = StatisticsModes.NONE;

        //input parsing
        int i = 0;
        while( i < args.length) {
            if (args[i].matches("-([a-zA-Z])")) {
                switch (args[i]) {
                    case "-s":
                        statisticsMode = StatisticsModes.SHORT;
                        break;
                    case "-f":
                        statisticsMode = StatisticsModes.FULL;
                        break;
                    case "-o":
                        path = args[++i] + "/";
                        break;
                    case "-p":
                        prefix = args[++i];
                        break;
                    case "-a":
                        appendMode = true;
                        break;
                    default:
                        break;
                }
            }
            else if (args[i].matches("([a-zA-Z0-9_]+\\.txt)")) {
                fileNames.add(args[i]);
            }
            ++i;
        }

        //

        StatisticsHandler statisticsHandler = StatisticsHandlers.newStatisticHandler(statisticsMode);
        DataHandler dataHandler = new FileDataHandler(fileNames, new RegExFilter(new FileOutputWriter(path, prefix, appendMode), statisticsHandler));

        dataHandler.handle();

        if (statisticsMode != StatisticsModes.NONE) {
            System.out.println(statisticsHandler.statistics());
        }
    }
}
