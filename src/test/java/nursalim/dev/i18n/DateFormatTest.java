package nursalim.dev.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    @Test
    void testDateFormat(){
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        String format = dateFormat.format(new Date());
        System.out.println(format);

    }

    @Test
    void testDateFormatLocaleIndonesia(){
        var pattern = "EEEE dd MMMM yyyy";
        var locale = new Locale("id", "ID");
        var dateFormat = new SimpleDateFormat(pattern, locale);

        String format = dateFormat.format(new Date());
        System.out.println(format);

    }

    @Test
    void testDateFormatLocaleJapan(){
        var pattern = "EEEE dd MMMM yyyy";
        var locale = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, locale);

        String format = dateFormat.format(new Date());
        System.out.println(format);

    }

    @Test
    void testDateParseLocaleIndonesia(){
        var pattern = "EEEE dd MMMM yyyy";
        var locale = new Locale("id", "ID");
        var dateFormat = new SimpleDateFormat(pattern, locale);

        Date format = null;
        try {
            format = dateFormat.parse("Sabtu 04 Februari 2023");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(format);

    }
}
