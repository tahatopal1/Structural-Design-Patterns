package Decorator;

public class App {
    public static void main(String[] args) {

        String content = getContent();

        System.out.println("***************** PLAIN REPORT EXPORTING HAS STARTED *****************");
        String plainExport = plainReportExport(content);
        System.out.println(plainExport);
        System.out.println("***************** PLAIN REPORT EXPORTING HAS STOPPED *****************");

        System.out.println("***************** LINED REPORT EXPORTING HAS STARTED *****************");
        plainExport = getLinedReportExport(content);
        System.out.println(plainExport);
        System.out.println("***************** LINED REPORT EXPORTING HAS STOPPED *****************");

        System.out.println("***************** SMALL REPORT EXPORTING HAS STARTED *****************");
        plainExport = getSmallReportExport(plainExport);
        System.out.println(plainExport);
        System.out.println("***************** SMALL REPORT EXPORTING HAS STARTED *****************");

        System.out.println("***************** SIGNATURED REPORT EXPORTING HAS STARTED *****************");
        plainExport = getSignaturedReportExport(plainExport);
        System.out.println(plainExport);
        System.out.println("***************** SIGNATURED REPORT EXPORTING HAS STOPPED *****************");


    }

    private static String getSignaturedReportExport(String plainExport) {
        ReportDecorator decorator = new SignaturedReportDecorator(new PlainReport(plainExport));
        return decorator.getText();
    }

    private static String getSmallReportExport(String plainExport) {
        ReportDecorator decorator = new SmallReportDecorator(new PlainReport(plainExport));
        return decorator.getText();
    }

    private static String getLinedReportExport(String content) {
        ReportDecorator decorator = new LinedReportDecorator(new PlainReport(content));
        return decorator.getText();
    }

    private static String getContent() {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                "\n Aenean suscipit massa ante. Nunc tempor, ante eget sollicitudin blandit, ex enim aliquet velit," +
                "\n commodo posuere nisl nunc et turpis. Cras blandit velit nibh, non tempus nisi pretium id. " +
                "\nCurabitur a mi quis nisi lobortis fermentum. Integer rhoncus odio tortor, eget rutrum enim gravida ac. " +
                "\nMorbi mollis sem sed nisl pulvinar iaculis. " +
                "\nDonec lacinia, mauris quis rhoncus volutpat, ante turpis viverra elit, ac maximus lectus arcu ultrices risus." +
                "\n Vivamus a pulvinar ex. Vivamus vel dui finibus, facilisis tellus ullamcorper, venenatis elit. Duis in sagittis augue.";
    }

    private static String plainReportExport(String content){
        PlainReport report = new PlainReport(content);
        String text = report.getText();
        return text;
    }

}
