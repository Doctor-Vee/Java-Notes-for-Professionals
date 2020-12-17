package assistance_classes;

public class Child extends Parent {

    public Child(String name, int age, String gender){
//        super(name, age);
//        this.name = name;
        this.setName(name);
        this.setAge(age);
    }
}
