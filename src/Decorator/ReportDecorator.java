package Decorator;

public abstract class ReportDecorator implements Report{

    private Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    @Override
    public String getText() {
        return report.getText();
    }
}
