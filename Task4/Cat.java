package Task4;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<?> cl = Animal.class;
        Animal cat = new Animal();
        System.out.println(cat.toString());

        Field newType = cl.getDeclaredField("type");
        newType.set(cat, "Cat");

        Field newAge = cl.getDeclaredField("age");
        newAge.setAccessible(true);
        newAge.setInt(cat, 7);

        Field newName = cl.getDeclaredField("name");
        newName.setAccessible(true);
        newName.set(cat, "Clint");

        System.out.println(cat.toString());

    }
}
