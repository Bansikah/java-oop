public class Zoo {

    public static void main(String [] args){

        //The animal class
//        Animal animal1 = new Animal("Cat", "Persian", "white", 2);
//        animal1.properties();
//        animal1.movement();
//        Animal animal2 = new Animal("Monkey", "Tamarin", "brown", 3);
//        animal2.properties();
//        animal2.Digestion();
        //The fish class
        Fish animal3 = new Fish();
        animal3.swim();
        //The bird class, also the concept of inheritance, the bird can now inherit the properties method
        Bird bird1 = new Bird("Zogi", "Parrot", "yellow", 4);
        bird1.properties();


        Chicken chick1 = new Chicken("Dodo", "Checkens", "brown", 1);
        chick1.fly();

        //it is posible to use the animal class to create a new sparrow cause it is inheriting properties from the parent
        //class bird and bird inherits from the class Animal so automatically, it inherits the properties of the class Animal.
      Animal sparrow1 = new Sparrow("Nicke", "bird", "white", 2);
      sparrow1.eat();


    }
}