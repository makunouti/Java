package 十六進数の表示;

public class main {
    public static void main(String[] args) {
        System.out.println("16進数の表示");
        System.out.println(String.format("16進数:%1$x",123));
        System.out.println(String.format("16進数:%1$X",1024));
        System.out.println(String.format("16進数:%1$x",0xff));
        System.out.println(String.format("16進数:%1$x",010));
    }
}
