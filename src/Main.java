import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("\nHello,\nPress 1 to enter new student,\nPress 2 to see existing student detail,\nPress 3 to quit.");

            int command = in.nextInt();
            in.nextLine();

            if(command == 1) {
                System.out.println("How many students will be added into the database? (NOTE: An integer should be given.)");
                int capacity = in.nextInt();
                in.nextLine();

                for(int i = 1; i <= capacity; i++) {
                    System.out.println("\nCreating student " + i + " account: ");

                    System.out.println("Enter student's name: ");
                    String name = in.nextLine();

                    NewStudent newStudent = new NewStudent(name);

                    System.out.println("Enter year: ");
                    String year = in.nextLine();
                    newStudent.setYear(year);

                    newStudent.setStudentId();

                    System.out.println("No of courses (NOTE: An interger should be given): ");
                    int noOfCourses = in.nextInt();
                    in.nextLine();

                    String[] courses = new String[noOfCourses];

                    for(int x = 0; x < noOfCourses; x++) {
                        System.out.println("Enter course " + (x + 1) + " : ");

                        courses[x] = in.nextLine();
                    }

                    newStudent.setCourses(courses);

                    while(true) {
                        System.out.println("\nPress 0 to continue with registration,\nPress 1 to see saved details.");
                        int prompt = in.nextInt();
                        in.nextLine();

                        if(prompt == 0) {
                            break;
                        } else if(prompt == 1) {
                            System.out.println("Name of student: " + newStudent.getName() + "\nStudent's year of admission: " + newStudent.getYear() + "\nStudent's ID: " + newStudent.getStudentId() + "\nList of enrolled courses: " + newStudent.getCourses());
                            break;
                        } else {
                            System.out.println("Invalid input");
                        }
                    }
                }

            }

            else if(command == 2) {
                System.out.println("Feature not yet available.");
                break;
            }

            else if (command == 3) {
                break;
            }

            else{
                System.out.println("Invalid input, try again.");
            }
        }

        in.close();
    }
}