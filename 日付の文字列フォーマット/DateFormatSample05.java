package 日付の文字列フォーマット;

import java.util.Calendar;


public class DateFormatSample05 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,3);
        System.out.println(String.format("日の表示(年初からの日数):%1$tj",cal));
        System.out.println(String.format("日の表示(月初からの日数(2桁表示)):%1$td",cal));
        System.out.println(String.format("日の表示(月初からの日数):%1$te",cal));
    }
}
