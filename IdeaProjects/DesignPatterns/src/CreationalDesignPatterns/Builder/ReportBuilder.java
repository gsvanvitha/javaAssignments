package CreationalDesignPatterns.Builder;

public abstract class ReportBuilder {
    private Report report;

    public void createNewReport()
    {
        report = new Report();
    }
    public Report getReport()
    {
        return report;
    }

    public abstract void setReportType();
    public abstract void setReportHeader();
    public abstract void setReportFooter();
    public abstract void setReportContent();
}
