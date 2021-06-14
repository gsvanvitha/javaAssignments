package CreationalDesignPatterns.Builder;

public class PdfReport extends ReportBuilder {

    @Override
    public void setReportType() {
        System.out.println("Step 1 : Set Report Type");
        getReport().setReportType("PDF");
    }

    @Override
    public void setReportHeader() {
        System.out.println("Step 2 : Set Report Header");
        getReport().setReportHeader("PDF Footer");
    }

    @Override
    public void setReportFooter() {
        System.out.println("Step 3 : Set Report Footer");
        getReport().setReportFooter("PDF Footer");
    }

    @Override
    public void setReportContent() {
        System.out.println("Step 4 : Set Report Content");
        getReport().setReportContent("PDF Content Type");
    }
}

