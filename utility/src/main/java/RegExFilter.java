import java.util.List;

public class RegExFilter implements DataFilter {
    OutputWriter outputWriter;
    StatisticsHandler statisticsHandler;

    @Override
    public void filter(String str) {
        if (str.matches("\\d+")) { //integer
            System.out.println("i am here, integer");
            outputWriter.writeInt(str);
        }
        else if (str.matches("\\d+\\.\\d+")) { //float
            System.out.println("i am here, float");
            outputWriter.writeFloat(str);
        }
        else { //string
            System.out.println("i am here, string");
            outputWriter.writeStr(str);
        }
    }
}
