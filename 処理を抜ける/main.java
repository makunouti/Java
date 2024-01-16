package 処理を抜ける;

public class main {
    public static main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            if(i == 5){
                break;
            }
            System.out.println(i);  
        }
        System.out.println("finished!!");
    }
}
