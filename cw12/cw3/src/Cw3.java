import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

abstract class Tlumacz {
    protected String firstLanguage;
    protected String secondLanguage;
    protected List<HashMap<String, String>> tlumaczenia = new ArrayList<>();

    public Tlumacz(String firstLanguage, String secondLanguage) {
        this.firstLanguage = firstLanguage;
        this.secondLanguage = secondLanguage;
    }

    public abstract void addTlumaczenie(String firstLanguageWord, String secondLanguageWord);
    public abstract String getTlumaczenie(String language, String word);

}

class EngPl extends Tlumacz {

    public EngPl(String firstLanguage, String secondLanguage) {
        super(firstLanguage, secondLanguage);
    }

    private String fixString(String str) {
        return str.toLowerCase().trim();
    }

    @Override
    public void addTlumaczenie(String firstLanguageWord, String secondLanguageWord) {
        HashMap<String, String> words = new HashMap<>();
        words.put(firstLanguage, fixString(firstLanguageWord) );
        words.put(secondLanguage, fixString(secondLanguageWord) );
        tlumaczenia.add(words);
    }

    @Override
    public String getTlumaczenie(String language, String word) {
        String res = null;
        for(HashMap<String, String> h : tlumaczenia) {
            if(h.get(language).equals( word.toLowerCase().trim() )) {
                res = h.get( language.equals(secondLanguage) ? firstLanguage : secondLanguage );
            }
        }
        return res;
    }
}

public class Cw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your language: ");
        String firstLanguage = scanner.nextLine();
        System.out.print("Enter foreign language: ");
        String secondLanguage = scanner.nextLine();
        EngPl tlumacz = new EngPl(firstLanguage, secondLanguage);
        tlumacz.addTlumaczenie("cucumber", "ogórek");
        tlumacz.addTlumaczenie("home", "Dom");
        tlumacz.addTlumaczenie("Translation", "tłumaczenie");
        tlumacz.addTlumaczenie("Apple", "Jabłko");
//        scanner.close();

        while (true) {
//            Scanner scan = new Scanner(System.in);
            System.out.print("Word of which language you want to know: ");
            String language = scanner.nextLine();

            System.out.print("Enter world: ");
            String word = scanner.nextLine();

            System.out.println("Translation: " + tlumacz.getTlumaczenie(language, word));
        }

    }
}
