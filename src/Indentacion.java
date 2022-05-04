import java.util.Locale;

public class Indentacion {
    public static float tamanoIndent = 0.5f;

    public static String getIndentedDiv(int numIndents){
        if(numIndents == 0){
            return "<div>";
        }else{
            return String.format(Locale.ENGLISH,"<div style=\"text-indent: %1$01.1fcm\">", numIndents*tamanoIndent);
        }
    }

    public static String getTabs(int numIndents){
        StringBuilder div = new StringBuilder("");
        for(int i = 0 ; i < numIndents ; i++) div.append('\t');
        return div.toString();
    }
}
