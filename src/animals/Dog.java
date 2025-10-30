package animals;

public class Dog extends Animal{
   private   String name ="Ralf";
   private   int age = 1;
     private String breed = "German Shepherd";//порода немецкая овчарка
     private String sound = "gav-gav";


     public void makeSound(){
          System.out.println("Собака по имени: "+ name + ": "+ sound);
     }

     public static void main(String[] args) {
Dog dog = new Dog();
dog.makeSound();}
}
