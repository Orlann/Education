package ua.edu.lnu.financial.classes;

public class MainApp {
    public static void main(String[] args) {
        Person andriy = new Person();
        andriy.age = 21;
        andriy.login = "Andriew";
        andriy.setName("Andriy");
        andriy.rights = "Student";

        System.out.println("Person "+andriy.getName()+" has nick "+
                andriy.login+" is "+andriy.age+" has rights "+andriy.rights);

        Person maks = new Person("Maksym");
        System.out.println("Person "+maks.getName());

        Person olya = new Person("Olya",20);
        System.out.println("Person "+olya.getName()+" is "+olya.getAge());

        System.out.println(olya);
    }
}
