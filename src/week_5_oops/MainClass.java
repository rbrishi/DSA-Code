package week_5_oops;

public class MainClass {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.age = 10;
        obj.color = "white";
        //obj.walk();

        Dog obj2 = new Dog();
        Dog obj3 = new Dog("Vansh");
        System.out.println(obj3.name);
//        System.out.println(obj2.name);
//        System.out.println(obj.age);
    }
}
class Dog{
    //Properties
    String name;
    int age;
    String color;

    //Constructor
    Dog(){
        name = "Huskey";
        System.out.println("vansh is barking");
    }
    Dog(String name1){
        this.name = name1;
    }

    //behaviour
    void walk(){
        System.out.println("Dog is walking");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
}