package 日付の文字列フォーマット;

import java.util.Calendar;
import java.util.Locale;

public class DateFormatSample07 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Locale.setDefault(Locale.JAPANESE);

        System.out.println(String.format("%1$tY 年 %1$tb 月 %1$te 日は、 %1$-8ta 曜日",cal));
        System.out.println(String.format("%1$tY 年 %1$tb 月 %1$te 日は、 %1$8ta 曜日",cal));
    }
}
