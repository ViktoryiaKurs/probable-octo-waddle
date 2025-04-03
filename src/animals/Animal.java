package animals;

public abstract class Animal {
    String name;
    int age;
    String sound;


    public  void makeSound(){
        System.out.println("Собака по имени: "+ name + ": "+ sound);
    }
}
