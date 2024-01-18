package 数字の先頭を空白で埋める;

public class main {
    public static void main(String[] args) {
        System.out.println(String.format("3桁の数字(先頭空白埋め):%1$3d",1));
        System.out.println(String.format("3桁の数字(先頭空白埋め):%1$3d",123));
        System.out.println(String.format("3桁の数字(先頭空白埋め):%1$3d",12345));
    }
}
