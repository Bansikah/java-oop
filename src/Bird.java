public class Bird extends Animal{
/* Inheritance
* The concept of inheritance is when the child class(Bird) can inherit properties
* from its parent class(Animal). This is done with the help of the "extends" and the "super" key
* words. */
    public Bird(String name, String breed, String color, int age){
        super(name, breed, color, age);
    }
//    public void fly(){
//        System.out.println("Hey, I am a bird");
//        System.out.println("and I can Fly");
//    }
public void eat(){
        System.out.println("I can eat");
}
}
