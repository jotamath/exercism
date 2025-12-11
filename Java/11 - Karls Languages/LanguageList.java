import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return (languages.size() == 0) ? true : false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return (languages.size() != 0 ) ? languages.get(0) : "";
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return (languages.contains(language)) ? true : false;
    }

    public boolean isExciting() {
        return (languages.contains("Java") | languages.contains("Kotlin")) ? true : false;
    }
}