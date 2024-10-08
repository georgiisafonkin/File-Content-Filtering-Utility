
public class RegExFilter implements DataFilter {
    private OutputWriter outputWriter;
    private StatisticsHandler statisticsHandler;
    public RegExFilter(OutputWriter outputWriter, StatisticsHandler statisticsHandler) {
        this.outputWriter = outputWriter;
        this.statisticsHandler = statisticsHandler;
    }
    @Override
    public void filter(String str) {
        if (str.matches("-?\\d+")) { //integer
            statisticsHandler.handleInt(Long.parseLong(str));
            outputWriter.writeInt(str);
        }
        else if (str.matches("-?\\d+\\.\\d+[Ee]?-?\\d*")) { //float
            statisticsHandler.handleFloat(Float.parseFloat(str));
            outputWriter.writeFloat(str);
        }
        else { //string
            statisticsHandler.handleStr(str);
            outputWriter.writeStr(str);
        }
    }
}
