package 部分文字列の取り出し;

public class main {
    public static void main(String[] args) {
        String str = "壱２34伍６789０";

        System.out.println(String.format("取り出し前の文字列 : %s", str));
        System.out.println("文字列先頭から3文字取り出す ->" + str.substring(0,3));
        System.out.println("文字列先頭から7文字取り出す ->" + str.substring(0,7));
    }
    
}
