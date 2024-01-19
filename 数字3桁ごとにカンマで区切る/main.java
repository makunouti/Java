package 数字3桁ごとにカンマで区切る;

public class main {
    public static void main(String[] args) {
        System.out.println(String.format("3桁の数字(3桁区切り文字):%1$,3d",1));
        System.out.println(String.format("3桁の数字(3桁区切り文字):%1$,3d",123));
        System.out.println(String.format("3桁の数字(3桁区切り文字):%1$,3d",12345));
        System.out.println(String.format("3桁の数字(3桁区切り文字):%1$,3d",-1));
        System.out.println(String.format("3桁の数字(3桁区切り文字):%1$,3d",-123));
        System.out.println(String.format("3桁の数字(3桁区切り文字):%1$,3d",-12345));
    }
}
