package 処理を抜ける;

public class main2 {
    public static void main(String[] args) {
        int i;
        int j;
        loop1:
        for (i = 0;i < 10; i++) {
            for (j = 0;j < 10; j++) {
                if((i == 1) && (j == 5)){
                    break loop1;
                }
            }
        }
    }
    
}
