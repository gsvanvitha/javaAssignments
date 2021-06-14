package CreationalDesignPatterns.Builder;

public class ReportDirector {
    public Report buildReport(ReportBuilder reportBuilder)
    {
        reportBuilder.createNewReport();
        reportBuilder.setReportType();
        reportBuilder.setReportHeader();
        reportBuilder.setReportFooter();
        reportBuilder.setReportContent();

        return reportBuilder.getReport();
    }
}
