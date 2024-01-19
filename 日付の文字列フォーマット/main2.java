package 日付の文字列フォーマット;

import java.util.Calendar;

public class main2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(String.format("月の表示:%1$tB",cal));
        System.out.println(String.format("月の表示(省略名):%1$tb",cal));
        System.out.println(String.format("月の表示(2桁):%1$tm",cal));
    }
}
