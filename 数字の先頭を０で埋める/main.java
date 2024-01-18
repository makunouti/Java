package 数字の先頭を０で埋める;

public class main {
    public static void main(String[] args) {
        System.out.println(String.format("3桁の数字(先頭0埋め):%1$03d",1));
        System.out.println(String.format("3桁の数字(先頭0埋め):%1$03d",123));
        System.out.println(String.format("3桁の数字(先頭0埋め):%1$03d",12345));
    }
}
