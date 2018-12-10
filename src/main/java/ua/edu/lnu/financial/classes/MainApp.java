package ua.edu.lnu.financial.classes;

public class MainApp {
    public static void main(String[] args) {
        final String CITY_CONST = "Lviv";
        Customer[] customers = new Customer[5];
        customers[0] = new Customer("Ivan", "Oleskiv", "Lviv", "55444544");
        customers[1] = new Customer("Ivan", "Oleskiv", "Kyiv", "55444544");
        customers[2] = new Customer("Ivan", "Oleskiv", "Lviv", "55444544");
        customers[3] = new Customer("Ivan", "Oleskiv", "Kyiv", "55444544");
        customers[4] = new Customer();
        customers[4].setFirtsName("Olga");
        customers[4].setSecondName("Kit");
        customers[4].setCity("Lviv");
        customers[4].setAccountNumber("5565321");
//        for (Customer item : customers) {
//            System.out.println(item);
//        }
        for (Customer item: customers) {
            item.showCitizen(CITY_CONST,item);
        }

//        Person andriy = new Person();
//        andriy.age = 21;
//        andriy.login = "Andriew";
//        andriy.setName("Andriy");
//        andriy.rights = "Student";
//
//        System.out.println("Person "+andriy.getName()+" has nick "+
//                andriy.login+" is "+andriy.age+" has rights "+andriy.rights);
//
//        Person maks = new Person("Maksym");
//        System.out.println("Person "+maks.getName());
//
//        Person olya = new Person("Olya",20);
//        System.out.println("Person "+olya.getName()+" is "+olya.getAge());
//
//        System.out.println(olya);
    }
}
