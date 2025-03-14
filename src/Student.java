public class Student {
   private String name;
   private int age;
    private int grade;
    public Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
 Student andrew = new Student("Andrew",18,5){
 };
        System.out.println("Имя студента: " + andrew.name);
        System.out.println("Возраст студента: " + andrew.age);
        System.out.println("Оценка студента: " + andrew.grade);
    }
}
