package CreationalDesignPatterns.Builder;

public class Report {
    private String reportType;
    private String reportHeader;
    private String reportFooter;
    private String reportContent;

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }


    public void setReportHeader(String reportHeader) {
        this.reportHeader = reportHeader;
    }


    public void setReportFooter(String reportFooter) {
        this.reportFooter = reportFooter;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public void displayReport()
    {
        System.out.println("Report Type :" + reportType);
        System.out.println("Header :" + reportHeader);
        System.out.println("Content :" + reportContent);
        System.out.println("Footer :" + reportFooter);
    }
}

