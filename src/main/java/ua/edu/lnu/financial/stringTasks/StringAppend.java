package ua.edu.lnu.financial.stringTasks;

public class StringAppend {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("42");
        StringBuilder s2 = s.append("+").append("33").append("=").append("75");
        System.out.println(s2);
        StringBuilder s3 = s2.replace(5,6," equals ");
        System.out.println(s3);
        StringBuilder s4 = s3.delete(6,13).insert(6,"= ");
        System.out.println(s4);
    }
}
