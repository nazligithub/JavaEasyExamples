import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age;
    }
}

public class StudentRegistrationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("To add a new student:");
            System.out.print("Enter the name (enter 'w' to exit):");
            String name = scanner.nextLine();
            if (name.equals("w")) {
                break;
            }
            System.out.print("Enter surname:");
            String surname = scanner.nextLine();

            System.out.print("Enter age:");
            int age = Integer.parseInt(scanner.nextLine());

            Student newStudent = new Student(name, surname, age);
            studentList.add(newStudent);

            System.out.println("Student registered!: " + newStudent);
        }

        System.out.println("Registered students:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        scanner.close();
    }
}

