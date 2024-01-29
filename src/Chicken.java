public class Chicken extends Bird{

    public Chicken(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }
        //Method overriding, overriding the method fly() in the Parent Bird class
        public void fly(){
            System.out.println("not able to fly...");
        }

}
