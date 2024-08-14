public class FullStatisticsHandler extends ShortStatisticsHandler implements StatisticsHandler {
    protected long minInteger = Long.MAX_VALUE;
    protected long maxInteger = Long.MIN_VALUE;
    protected float minFloat = Float.MAX_VALUE;
    protected float maxFloat = Float.MIN_VALUE;
    protected long sumInteger = 0;
    protected float sumFloat = 0;
    protected int minStrLen = Integer.MAX_VALUE;
    protected int maxStrLen = Integer.MIN_VALUE;
    @Override
    public void handleStr(String strVal) {
        super.handleStr(strVal);
        minStrLen = Math.min(strVal.length(), minStrLen);
        maxStrLen = Math.max(strVal.length(), maxStrLen);
    }

    @Override
    public void handleInt(long integerVal) {
        super.handleInt(integerVal);
        minInteger = Math.min(integerVal, minInteger);
        maxInteger = Math.max(integerVal, maxInteger);
        sumInteger += integerVal;
    }

    @Override
    public void handleFloat(float floatVal) {
        super.handleFloat(floatVal);
        minFloat = Math.min(floatVal, minFloat);
        maxFloat = Math.max(floatVal, maxFloat);
        sumFloat += floatVal;
    }

    @Override
    public String statistics() {
        return super.statistics() + "Min Integer Value: " + minInteger + "\n" +
                "Max Integer Value: " + maxInteger + "\n" +
                "Integer sum: " + sumInteger + "\n" +
                "Integer arithmetic mean: " + getArithmeticInt() + "\n" +
                "Min Float Value: " + minFloat + "\n" +
                "Max Float Value: " + maxFloat + "\n" +
                "Float sum: " + sumFloat + "\n" +
                "Float arithmetic mean: " + getArithmeticFloat() + "\n" +
                "Min string length: " + minStrLen + "\n" +
                "Max string length: " + maxStrLen + "\n";
    }
    private long getArithmeticInt() {
        return sumInteger / intElementsNumber;
    }
    private float getArithmeticFloat() {
        return sumFloat / floatElementsNumber;
    }
}
