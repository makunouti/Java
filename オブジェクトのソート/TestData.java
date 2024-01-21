package オブジェクトのソート;

public class TestData {

    private String name;
    private int age;
    private int number;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = number;
    }

    public String toString() {
        return "番号:" + number + " "
        + "名前:" + name + " " + "年齢:" + age;
    }
}
