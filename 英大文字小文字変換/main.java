package 英大文字小文字変換;

public class main {
    public static void main(String[] args) {
        String str = "English日本語aBc";
        System.out.println(String.format("切り出し前の文字列 : %s", str));
        System.out.println("英小文字を大文字に変換 ->" + str.toUpperCase());
        System.out.println("英大文字を小文字に変換 ->" + str.toLowerCase());
    }
}
