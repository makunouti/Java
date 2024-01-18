package 半角英字全角英字変換;

public class main {
    public static void main(String[] args) {
        String str = "ab漢字cDディーＥＦGＨＩＪzZ!$&";
        System.out.println("変換前：" + str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++ ) {
          char c = str.charAt(i);
          if ( 'a' <= c && c <= 'z') {
            c = (char)(c - 'a' + 'ａ');
          } else if ( 'A' <= c && c <= 'Z') {
            c = (char)(c - 'A' + 'Ａ');
          }
          sb.append(c);
        }
        System.out.println("変換後：" + sb.toString());
    }
}
