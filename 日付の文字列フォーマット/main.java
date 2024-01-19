package 日付の文字列フォーマット;

import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(String.format("西暦年の表示:%1$tY",cal));
        System.out.println(String.format("西暦年の表示(4桁年/100):%1$tC",cal));
        System.out.println(String.format("西暦年の表示(2桁):%1$ty",cal));
    }
}
