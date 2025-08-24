package solid.ex10.src;

public class Configs {
    public static Logger logger = new ConsoleLogger();
    public static ReportService reportService = new ReportService(Configs.logger);
}
