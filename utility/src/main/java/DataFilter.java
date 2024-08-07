import java.util.List;

public class DataFilter implements IFilter {
    private List<String> dataToFilter;
    private Data filteredData;
    public DataFilter(List<String> dataToFilter) {
        this.dataToFilter = dataToFilter;
        filteredData = new Data();
    }

    @Override
    public void filter() {
        for (String line : dataToFilter) {
            if (line.matches("\\d+")) { //integer
                filteredData.getIntegerList().add(Integer.valueOf(line));
                System.out.println("i am here, integer");
            }
            else if (line.matches("\\d+\\.\\d+")) { //float
                filteredData.getFloatList().add(Float.valueOf(line));
                System.out.println("i am here, float");
            }
            else { //string
                filteredData.getStringList().add(line);
                System.out.println("i am here, string");
            }
        }
    }

    @Override
    public Data getData() {
        return filteredData;
    }
}
