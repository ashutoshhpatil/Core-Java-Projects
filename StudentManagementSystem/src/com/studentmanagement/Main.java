package com.studentmanagement;
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name,dept;
        double marks;

        ArrayList<Student> l = new ArrayList<>();
        while(true) {
            System.out.println("=========Display Menu=========");
            System.out.println("1. Add Students");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.println("4. Search Student By ID");
            System.out.println("5. Search Student By Name");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");

            System.out.println("Enter Your Choice:");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID:");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name:");
                    name = sc.nextLine();

                    System.out.println("Enter Department:");
                    dept = sc.nextLine();

                    System.out.println("Enter Marks:");
                    marks = sc.nextDouble();

                    Student students = new Student(id, name, dept, marks);
                    l.add(students);
                    break;

                case 2:
                    if(l.isEmpty()){
                        System.out.println("No Students Found");
                    }else{
                    for (Student std : l) {
                        System.out.println(std);
                    }
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

                case 4:
                    System.out.println("Enter Student ID to Search");
                    int searchId = sc.nextInt();

                    boolean found =false;
                    for(Student student : l) {
                        if (student.getId() == searchId) {
                            System.out.println(student);
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 5:
                    System.out.println("Enter Student Name to Search");
                    sc.nextLine();
                    String searchName = sc.nextLine();

                    boolean nameFound = false;
                    for(Student student : l){
                        if(student.getName().equalsIgnoreCase(searchName)){
                            System.out.println(student);
                            nameFound =true;
                            break;
                        }
                    }
                    if(!nameFound) {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 6:
                    System.out.println("Enter Student ID to Update:");
                    int updateId = sc.nextInt();

                    boolean UpdateIdFound =false;

                    for(Student student: l){
                        if(student.getId() == updateId){
                            System.out.println("Enter new Name:");
                            sc.nextLine();
                            String newName = sc.nextLine();
                            student.setName(newName);

                            System.out.println("Enter new Department");
                            String newDept = sc.nextLine();
                            student.setDept(newDept);

                            System.out.println("Enter New Marks");
                            double newMarks = sc.nextDouble();
                            student.setMarks(newMarks);

                            System.out.println("Student Updated Succesfully");

                            UpdateIdFound =true;
                            break;
                        }
                    }

                    if(!UpdateIdFound) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 7:
                    System.out.println("Enter Id to Delete Student: ");
                    int deleteId = sc.nextInt();
                    boolean deleteFound =false;

                    Iterator<Student> itr = l.iterator();
                    while (itr.hasNext()){
                        Student student = itr.next();
                        if(student.getId()==deleteId){
                            itr.remove();
                            deleteFound =true;
                            System.out.println("Successfully Deleted");
                            break;

                        }
                    }

                    if(!deleteFound){
                        System.out.println("Student Not Found");
                    }
                    break;
            }
        }

    }
}