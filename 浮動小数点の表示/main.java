package 浮動小数点の表示;

public class main {
    public static void main(String[] args) {
        System.out.println(String.format("浮動小数点の表示:%1$3e",Math.PI));
        System.out.println(String.format("浮動小数点の表示:%1$3f",Math.PI));
        System.out.println(String.format("浮動小数点の表示:%1$3g",Math.PI));
        System.out.println(String.format("浮動小数点の表示:%f1$3a",Math.PI));
    }
}
