package nursalim.dev.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    @Test
    void testResourceBundle(){
        var resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleIndonesia(){
        var resourceBundle = ResourceBundle.getBundle("message", new Locale("id", "ID"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleNotFound(){
        var resourceBundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleMultipleTimes(){
        var resourceBundle1 = ResourceBundle.getBundle("message", new Locale("en", "US"));
        var resourceBundle2 = ResourceBundle.getBundle("message", new Locale("en", "US"));

        System.out.println(resourceBundle1.equals(resourceBundle2));
        System.out.println(resourceBundle1 == resourceBundle2);
    }
}
