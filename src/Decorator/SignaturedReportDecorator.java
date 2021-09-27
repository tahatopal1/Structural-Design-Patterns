package Decorator;

public class SignaturedReportDecorator extends ReportDecorator {

    public SignaturedReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getText() {
        String text =  super.getText();
        String signaturedText = ReportUtil.addSignaturedText(text);
        return signaturedText;
    }
}
