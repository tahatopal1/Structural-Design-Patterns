package Decorator;

public class LinedReportDecorator extends ReportDecorator {

    public LinedReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getText() {
        String text = super.getText();
        String linedText = ReportUtil.getLinedText(text);
        return linedText;
    }
}
