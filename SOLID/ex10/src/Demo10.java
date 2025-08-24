package solid.ex10.src;

public class Demo10 {
    public static void main(String[] args) {
        ReportService reportService = Configs.reportService;
        reportService.generate();
    }
}
