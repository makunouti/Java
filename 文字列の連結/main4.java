package 文字列の連結;

public class main4 {
    public static void main(String[] args) {
        String str1 = "文字列1";
        String str2 = "文字列2";
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        String str = sb.toString();

        System.out.println("StringBuilderによる文字列の連結 ->" + str);
    }    
}
