public class Sparrow extends Bird implements Flyable{

    public Sparrow(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }

    public void fly(){
        System.out.println("I can fly high");
    }
    @Override
    public void eat() {

    }


    }
