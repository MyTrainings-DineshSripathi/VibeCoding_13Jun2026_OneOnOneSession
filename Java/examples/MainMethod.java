public class MainMethod {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Robert", 23);
        Student student3 = new Student();
        Student student4 = new Student();
        System.out.println(student1);
        System.out.println(student1.name);
        System.out.println(student1.age);
    }
}
