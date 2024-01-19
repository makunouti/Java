package 八進数の表示;

public class main {
    public static void main(String[] args) {
        System.out.println("8進数の表示");
        System.out.println(String.format("8進数表記:%1$o",123));
        System.out.println(String.format("8進数表記:%1$o",1024));
        System.out.println(String.format("8進数表記:%1$o",0xff));
        System.out.println(String.format("8進数表記:%1$o",010));
    }
}
