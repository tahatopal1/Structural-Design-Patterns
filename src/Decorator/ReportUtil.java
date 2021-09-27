package Decorator;

import java.util.ArrayList;
import java.util.List;

public class ReportUtil {

    public static String getLinedText(String text) {
        String[] lineList = text.split("\n");
        String linedText = "";
        for (String s : lineList) {
            String lined = addLine(s);
            linedText = linedText + lined;
        }
        return linedText;
    }

    public static String fitReport(String text, int width) {
        String smallLinedText = "";
        String[] lineList = text.split("\n");
        for (String s : lineList) {
            if (s.length() <= width){
                // Add anyways
                smallLinedText = addAndNavigateNewLine(smallLinedText, s);
            }else{
                List<String> pieces = breakdownLine(s, width);
                for (String piece : pieces) {
                    smallLinedText = addAndNavigateNewLine(smallLinedText, piece);
                }
            }
        }
        return smallLinedText;
    }

    private static String addAndNavigateNewLine(String mainText, String additionalText) {
        return mainText + additionalText + "\n";
    }

    private static List<String> breakdownLine(String line, int width) {

        int len = line.length();
        List<String> piecesList = new ArrayList<>();
        for (int i = 0; i <= len / width; i++){
            int firstStop = width * i;
            int lastStop  = firstStop + width;

            if (lastStop > len){
                lastStop = len;
            }

            String piece = line.substring(firstStop, lastStop);

            if (piece.trim().length() > 0)
                piecesList.add(piece);

        }

        return piecesList;

    }

    private static String addLine(String s) {

        String newLine;
        if (s.trim().length() == 0)
            newLine = "\n";
        else
            newLine = "\n-" + s;

        return newLine;

    }

    public static String addSignaturedText(String text) {

        String signature = "\n\n\t\t\t\t Signature: ";
        return text + signature;

    }
}
