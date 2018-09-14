package ua.edu.lnu.financial.classes;

public class Person {
    private String name;
    int age;
    String login;
    String rights;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", rights='" + rights + '\'' +
                '}';
    }
}
