package animals;

public abstract class Animal {
   private String name;
    private int age;
    private String sound;


    public  void makeSound(){
        System.out.println("Собака по имени: "+ name + ": "+ sound);
    }
}
