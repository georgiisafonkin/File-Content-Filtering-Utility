import java.util.List;

public class DataFilter implements IFilter {
    private List<String> dataToFilter;
    private Data filteredData;
    public DataFilter(List<String> dataToFilter) {
        this.dataToFilter = dataToFilter;
    }

    @Override
    public void filter() {

    }

    @Override
    public Data getData() {
        return filteredData;
    }
}
