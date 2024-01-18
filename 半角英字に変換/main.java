package 半角英字に変換;

public class main {
    public static void main(String[] args) {
        String str = "ａｂ漢字ｃＤディーefＧＨＩJｚＺ!$&";
        System.out.println("変換前 :" + str);

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            if( 'ａ' <= c && c <= 'ｚ') {
                c = (char)(c - 'ａ' + 'a' );
            } else if( 'Ａ' <= c && c <= 'Ｚ') {
                c = (char)(c -  'Ａ' + 'A' );
            }
            sb.append(c);
        }
        System.out.println("変換後 :" + sb.toString());
    }    
}
