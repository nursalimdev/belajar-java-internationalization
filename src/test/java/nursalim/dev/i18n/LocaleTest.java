package nursalim.dev.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {
    @Test
    void testNewLocale(){
        String language = "id";
        String country = "ID";

        var locale = new Locale(language, country);
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());

        System.out.println(locale.getLanguage());
        System.out.println(locale.getDisplayLanguage());
    }

    @Test
    void testNewLocaleUS(){
        String language = "en";
        String country = "US";

        var locale = new Locale(language, country);
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());

        System.out.println(locale.getLanguage());
        System.out.println(locale.getDisplayLanguage());
    }
}
