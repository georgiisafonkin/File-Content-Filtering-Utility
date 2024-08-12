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
        if (str.matches("-?\\d+")) { //integer
            statisticsHandler.handleInt(Integer.valueOf(str));
            outputWriter.writeInt(str);
        }
        else if (str.matches("-?\\d+\\.\\d+[Ee]?-?\\d*")) { //float
            statisticsHandler.handleFloat(Float.valueOf(str));
            outputWriter.writeFloat(str);
        }
        else { //string
            statisticsHandler.handleStr(str);
            outputWriter.writeStr(str);
        }
    }
}
