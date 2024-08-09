public class ShortStatisticsHandle implements StatisticsHandler {
    protected int intElementsNumber;
    protected int floatElementsNumber;
    protected int strElementsNumber;
    @Override
    public void handleStr(String strVal) {
        ++strElementsNumber;
    }

    @Override
    public void handleInt(int intVal) {
        ++intElementsNumber;
    }

    @Override
    public void handleFloat(float floatVal) {
        ++floatElementsNumber;
    }

    @Override
    public String statistics() {
        return "Integers: " + intElementsNumber + "\n" +
                "Floats: " + floatElementsNumber + "\n" +
                "Strings: " + strElementsNumber + "\n";
    }
}
