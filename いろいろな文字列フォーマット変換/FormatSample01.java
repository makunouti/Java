package いろいろな文字列フォーマット変換;

import java.util.Calendar;
import java.util.Locale;


public class FormatSample01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int num = 1;

        Locale.setDefault(Locale.JAPANESE);

        System.out.println(String.format(
            "No.%2$05d:今日の日付は、%1$tY年 %1$tB月 %1$te日 %1$ta曜日", cal,num
            ));
            System.out.println(String.format(
                "ただいまの時刻は、%1$TH時、 %1$TM分 %1$TS秒です",cal
            ));
    }
}
