public class FullStatisticsHandle extends ShortStatisticsHandle implements StatisticsHandler {
    protected int minInt = Integer.MAX_VALUE;
    protected int maxInt = Integer.MIN_VALUE;
    protected float minFloat = Float.MAX_VALUE;
    protected float maxFloat = Float.MIN_VALUE;
    protected int sumInt = 0;
    protected float sumFloat = 0;
    protected int minStrLen = Integer.MAX_VALUE;
    protected int maxStrLen = Integer.MIN_VALUE;
    @Override
    public void handleStr(String strVal) {
        super.handleStr(strVal);
        minStrLen = strVal.length() < minStrLen ? strVal.length() : minStrLen;
        maxStrLen = strVal.length() >= maxStrLen ? strVal.length() : maxStrLen;
    }

    @Override
    public void handleInt(int intVal) {
        super.handleInt(intVal);
        minInt = intVal < minInt ? intVal : minInt;
        maxInt = intVal >= maxInt ? intVal : maxInt;
        sumInt += intVal;
    }

    @Override
    public void handleFloat(float floatVal) {
        super.handleFloat(floatVal);
        minFloat = floatVal < minFloat ? floatVal : minFloat;
        maxFloat = floatVal >= maxFloat ? floatVal : maxFloat;
        sumFloat += floatVal;
    }

    @Override
    public String statistics() {
        return super.statistics() + "Min Integer Value: " + minInt + "\n" +
                "Max Integer Value: " + maxInt + "\n" +
                "Integer sum: " + sumInt + "\n" +
                "Integer arithmetic mean: " + getArithmeticInt() + "\n" +
                "Min Float Value: " + minFloat + "\n" +
                "Max Float Value: " + maxFloat + "\n" +
                "Float sum: " + sumFloat + "\n" +
                "Float arithmetic mean: " + getArithmeticInt() + "\n" +
                "Min string length: " + minStrLen + "\n" +
                "Max string length: " + maxStrLen + "\n";
    }
    private int getArithmeticInt() {
        return sumInt / intElementsNumber;
    }
    private float getArithmeticFloat() {
        return sumFloat / floatElementsNumber;
    }
}
