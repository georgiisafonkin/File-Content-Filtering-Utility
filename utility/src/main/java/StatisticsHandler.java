public interface StatisticsHandler {
    void handleStr(String strVal);
    void handleInt(Long intVal);
    void handleFloat(float floatVal);
    String statistics();
}
