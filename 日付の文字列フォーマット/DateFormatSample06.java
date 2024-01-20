package 日付の文字列フォーマット;

import java.util.Calendar;
import java.util.Locale;

public class DateFormatSample06 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(String.format("曜日の表示(曜日の短縮名):%1$ta",cal));
        System.out.println(String.format("曜日の表示(曜日の完全名):%1$tA",cal));
        System.out.println();
        System.out.println("英語表記");
        Locale.setDefault(Locale.ENGLISH);
        System.out.println(String.format("曜日の表示(曜日の短縮名):%1$ta",cal));
        System.out.println(String.format("曜日の表示(曜日の完全名):%1$tA",cal));
        System.out.println();
        System.out.println("日本語表記");
        Locale.setDefault(Locale.JAPANESE);
        System.out.println(String.format("曜日の表示(曜日の短縮名):%1$ta",cal));
        System.out.println(String.format("曜日の表示(曜日の完全名):%1$tA",cal));
        
    }
}
