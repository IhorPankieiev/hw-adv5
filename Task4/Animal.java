package Task4;

public class Animal {
    public String type = "Dog";
    private int age = 5;
    protected String name = "Django";

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Animal() {

    }
}
