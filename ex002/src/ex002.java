import java.util.Locale;
import java.util.Locale.LanguageRange;

public class ex002 {
    public static void main(String[] args){
        Locale lingua = Locale.getDefault();
        System.out.println("A linguagem do seu sistema é:");
        System.out.println(lingua.getDisplayLanguage());
    }
}