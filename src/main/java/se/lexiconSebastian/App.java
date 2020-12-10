package se.lexiconSebastian;


public class App {
    public static void main(String[] args) {
        Person mehrdad=new Person();
        mehrdad.firstName="Mehrdad";
        mehrdad.lastName="Javan";
        mehrdad.age=33;
        mehrdad.hobby="programming";
        mehrdad.showInformation();

        Person sebastian=new Person();
        sebastian.firstName="Sebastian";
        sebastian.lastName="Bocaciu";
        sebastian.age=42;
        sebastian.hobby="Java programming";
        sebastian.showInformation();

        double result = mehrdad.age+sebastian.age;
        System.out.println(result);

        String firstName = "Sebastian";
        String lastName= " Bocaciu";
        System.out.println(firstName + lastName);
    }
}
