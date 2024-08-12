public class StatisticsHandlers {
    public static StatisticsHandler newStatisticHandler(StatisticsModes statisticsMode) {
        return statisticsMode == StatisticsModes.FULL ? new FullStatisticsHandler() : new ShortStatisticsHandler();
    }
}
