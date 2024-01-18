package 文字列の分割;

public class main {
    public static void main(String[] args) {
        String str = "文字列１,String Two,あいう";
        String[] strs = str.split(",");
        System.out.println(String.format("分割前の文字列 : %s",str));
        for(int i = 0; i < strs.length; i++) {
            System.out.println(String.format("分割後 %d 個目の文字列 -> %s", i + 1, strs[i]));
        }
    }    
}