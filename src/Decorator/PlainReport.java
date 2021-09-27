package Decorator;

public class PlainReport implements Report{

    private String text;

    public PlainReport(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
