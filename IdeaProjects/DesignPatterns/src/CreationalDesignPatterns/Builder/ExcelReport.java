package CreationalDesignPatterns.Builder;

public class ExcelReport extends ReportBuilder {

    @Override
    public void setReportType() {
        System.out.println("Step 1 : Set Report Type");
        getReport().setReportType("Excel");
    }

    @Override
    public void setReportHeader() {
        System.out.println("Step 2 : Set Report Header");
        getReport().setReportHeader("Excel Footer");
    }

    @Override
    public void setReportFooter() {
        System.out.println("Step 3 : Set Report Footer");
        getReport().setReportFooter("Excel Footer");
    }

    @Override
    public void setReportContent() {
        System.out.println("Step 4 : Set Report Content");
        getReport().setReportContent("Excel Content Type");
    }
}

