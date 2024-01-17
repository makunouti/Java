import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.print.attribute.TextSyntax;

package 文字列連結実行比較;

public class main {
    public static void main(String[] args) {
        //連結回数
        int count = 10000;

        //開始ミリ秒を保持する変数
        long begin = 0;

        //終了ミリ秒を保持する変数
        long end = 0;

        //連結文字列を保持する変数
        String string = "";

        //文字列のリスト作成
        List strings = new ArrayList();
        for(int i = 0;i < count; i++) {
            strings.add("[Str" + String.format("%1$03d",1) + "]");
            }
            ConcatTest cst = new ConcatTest();

            //+演算子による文字列の連結
            being = Calendar.getInstance().getTimeInMillis();
            strig = cst.concat1(strings);
            end = Calendar.getInstance().getTimeInMillis();
            System.out.println("+演算子による文字連結");
            System.out.println(" 連結回数 =" + count);
            System.out.println(" 連結後文字列の文字数 =" + string.length());
            System.out.println(" 実行時間 =" + (end - being) + "ミリ秒");
            System.out.println();
        }
    }
}