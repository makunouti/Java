package 正規表現;

public class RegularSample1 {
    public static void main(String[] args) {
        String[] strs = {"a", "aaa", "bccd", "bcaacd", "fgdcaa", "bcaacaad"};
        String reg = "a*";

        for(int i = 0; i < strs.length; i++) {
            if(strs[i].matches(reg)) {
                + strs[i] + "\"は、正規表現\""+ reg + "\"にマッチする");
            } else {
              System.out.println("文字列" + (i + 1) + ":\""
                 + strs[i] + "\"は、正規表現\"" + reg + "\"にマッチしない");
            }
        }
    }
}
