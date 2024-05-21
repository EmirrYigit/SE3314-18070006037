package org.example;

public class Character {
    private String name;
    private int age;

    public Character(String name, int age) {
        if (name.equals(" ")) throw new RuntimeException("Anyone can not be nameless!");
        if (age <= 0 ) throw new RuntimeException("Age can not be minus or 0.");
        name = name;
        age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == " ") throw new RuntimeException("Anyone can not be nameless!");
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0 ) throw new RuntimeException("Age can not be minus or 0.");
        this.age = age;
    }
}
