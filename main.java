import java.util.ArrayList;
import java.util.list;
import java.util.Scanner;

class Student{
    private String name;
    private int rollNumber;
    private Atring grade;

    public Student(string name, int rollnumber, String grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public String getGrade(){
        return grade;
    }

    Override
    public string toString(){
        return "Name: "+ name +",Roll Number: "+rollNumber + ", Grade:" + grade;
    }
}

class StudentManagementSystem{
    private List<Student> students;

    public StudentManagementSystem(){
        students = new ArrayList<>();
    }

    public void addStudent (Student student){
        students.add(student);
        System.out.println(x:"Student added successfully.");
    }

    public void removeStudent(int rollnumber){
        students.removeIf(student -> student.getRollNumber()= rollNumber);
        System.out.println(x:"Student removed successfully.");
    }

    public Student searchStuddent(int rollNumber){
        for (Student student : students){
            if(student.getRollNumber()== rollNumber){
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents(){
        System.out.println(x:"List of Students: ");
        for (Student student : students){
            System.out.println(student);
        }
    }
}

public class main{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true){
            System.out.println(x:"\nStudent Management System");
            System.out.println(x:"1. Add Student");
            System.out.println(x:"2. Remove Student");
            System.out.println(x:"3. Search Student");
            System.out.println(x:"4. Display All Students");
            System.out.println(x:"5. Exit");
            System.out.println(s:"Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print(s:"Enter student name: ");
                    String name = scanner .nextLine();
                    System.out.print(s:"Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print(s:"Enter grade: ");
                    String grade = scanner.nextLine();

                    Student newStudent = new Student (name , rollNumber , grade);
                    system.addStudent(newStudent);
                    break;
                case 2:
                System.out.print(s:"Enter roll number of student to remove : ");
                int rollToRemove = scanner.nextInt();
                system.removeStudent(rollToRemove);
                break;
            case 3:
                    System.out.print(s:"Enter roll number of student to search:  ");
                    int rollToSearch = scanner.nextInt();
                    Student foundStudent =system.searchStudent(rollToSearch);
                    if (foundStudent !=null){
                        System.out.println("Student found: "+ foundStudent);
                    }else{
                        System.out.println(x:"Student not found.");
                    }
                    break;
                case 4:
                    system.displayAllStudents();
                    break;
                case 5:
                System.out.println(x:"Exiting...");
                scanner.close();
                System.exit(status:0);
            default:
                    System.out.println(x:"Invalid choice. Please enter a valid option .");
            }
        }
    }
}