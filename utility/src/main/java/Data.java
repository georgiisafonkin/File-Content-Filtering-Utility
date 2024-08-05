import java.util.ArrayList;
import java.util.List;

public class Data {
    public List<String> getStringList() {
        return stringList;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public List<Float> getFloatList() {
        return floatList;
    }

    private List<String> stringList;
    private List<Integer> integerList;
    private List<Float> floatList;
    public Data() {
        stringList = new ArrayList<>();
        integerList = new ArrayList<>();
        floatList = new ArrayList<>();
    }
}
