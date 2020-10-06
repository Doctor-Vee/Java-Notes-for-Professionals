package assistance_classes;

public class Person {
    String name;
    int age;

    Person(){}

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Doctor Vee has programmed me to say that my name is %s and that my age is %s", name, age);
    }
}
