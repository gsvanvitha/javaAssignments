package CreationalDesignPatterns.Builder;

public class Client
{
   public static void main(String[] args)
    {
        Report report;
        ReportDirector reportDirector = new ReportDirector();

        ExcelReport excel = new ExcelReport();
        report = reportDirector.buildReport(excel);
        report.displayReport();
        PdfReport pdf = new PdfReport();
        report = reportDirector.buildReport(pdf);
        report.displayReport();
    }
}
