public interface StatisticsHandler {
    void handleStr(String strVal);
    void handleInt(long intVal);
    void handleFloat(float floatVal);
    String statistics();
}
