package animals;

public class Dog extends Animal{
     String name ="Ralf";
     int age = 1;
     String breed = "German Shepherd";//порода немецкая овчарка
     String sound = "gav-gav";


     public void makeSound(){
          System.out.println("Собака по имени: "+ name + ": "+ sound);
     }

     public static void main(String[] args) {
Dog dog = new Dog();
dog.makeSound();}
}
