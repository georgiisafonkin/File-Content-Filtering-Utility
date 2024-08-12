public class ShortStatisticsHandler implements StatisticsHandler {
    protected int intElementsNumber = 0;
    protected int floatElementsNumber = 0;
    protected int strElementsNumber = 0;
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
