public class Animal {

    public static void main(String [] args){

        Zoo animal1 = new Zoo("Cat", "Persian", "white", 2);
        Zoo animal2 = new Zoo("Monkey", "Tamarin", "brown", 3);

        animal1.properties();
        animal1.movement();

        animal2.properties();
        animal2.Digestion();
    }
}
