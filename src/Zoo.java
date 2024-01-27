public class Zoo {
      //Declaring our variables globally
        String name;
        String breed;

        String color;

        int age;

        //Constructor
        public Zoo(String name, String breed, String color, int age){
    this.name = name;
    this.breed = breed;
    this.color = color;
    this.age = age;

}
//other methods
        public void properties(){
            System.out.println("I am animal "+ name);
            System.out.println("I am of breed "+ breed);
            System.out.println("My color is "+ color);
            System.out.println("I am "+ age +" years old");
        }

        public void Sens(){
            System.out.println("I have sensory organs");
        }

        public void movement(){
            System.out.println("I can move....");
        }
        public void Digestion(){
            System.out.println("I can digest food");
        }


}
