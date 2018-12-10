package ua.edu.lnu.financial.abstractClassesAndInterfaces;

public class AbstractClassRunner {
    public static void main(String[] args) {
        Person person1 = new Teacher();
        Person person2 = new Doctor();

        person1.name = "Ivan";
        person1.age = 32;
        person2.name = "Olga";
        person2.age = 21;

        person1.printName(person1.name);
        person1.printAge(person1.age);
        person2.printName(person2.name);
        person2.printAge(person2.age);
        person1.printWork(person1.work);


    }
}
