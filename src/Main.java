//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "James");
        Student student2 = new Student(2, "Edwin");

        System.out.println( "The student ID Number is : " + student1.getId());
        System.out.println("The student's name is :" + student1.getName());

        System.out.println("________________________________________________________________");

        System.out.println( "The student ID Number is : " + student2.getId());
        System.out.println("The student's name is :" + student2.getName());



    }
}