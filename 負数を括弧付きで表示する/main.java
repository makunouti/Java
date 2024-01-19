package 負数を括弧付きで表示する;

public class main {
    public static void main(String[] args) {
        System.out.println(String.format("3桁の数字(符号付き):%1$(3d",1));
        System.out.println(String.format("3桁の数字(符号付き):%1$(3d",123));
        System.out.println(String.format("3桁の数字(符号付き):%1$(3d",12345));
        System.out.println(String.format("3桁の数字(符号付き):%1$(3d",-1));
        System.out.println(String.format("3桁の数字(符号付き):%1$(3d",-123));
        System.out.println(String.format("3桁の数字(符号付き):%1$(3d",-12345));
    }
}
