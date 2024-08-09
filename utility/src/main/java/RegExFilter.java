import java.util.List;

public class RegExFilter implements DataFilter {
    OutputWriter outputWriter;
    StatisticsHandler statisticsHandler;
    public RegExFilter(OutputWriter outputWriter, StatisticsHandler statisticsHandler) {
        this.outputWriter = outputWriter;
        this.statisticsHandler = statisticsHandler;
    }
    @Override
    public void filter(String str) {
        if (str.matches("\\d+")) { //integer
            System.out.println("i am here, integer");
            statisticsHandler.handleInt(Integer.valueOf(str));
            outputWriter.writeInt(str);
        }
        else if (str.matches("\\d+\\.\\d+")) { //float
            System.out.println("i am here, float");
            statisticsHandler.handleFloat(Float.valueOf(str));
            outputWriter.writeFloat(str);
        }
        else { //string
            System.out.println("i am here, string");
            statisticsHandler.handleStr(str);
            outputWriter.writeStr(str);
        }
    }
}
