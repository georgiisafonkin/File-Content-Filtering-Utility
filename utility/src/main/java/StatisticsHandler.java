public interface StatisticsHandler {
    void handleStr(String strVal);
    void handleInt(int intVal);
    void handleFloat(float floatVal);
    String statistics();
}
