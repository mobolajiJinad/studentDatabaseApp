import java.util.Arrays;
import java.util.Random;

public class NewStudent {
    Random random = new Random();
    private int capacity;
    private int noOfCourses;
    private String name;
    private String year;
    private String studentId;
    private String courses[] = new String[noOfCourses];
    private int costOfCourse;

    protected NewStudent(String name) {
        this.name = name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected  void setYear(String year) {
        this.year = year;
    }

    protected void setStudentId() {
        this.studentId = StudentId(this.year);
    }

    protected void setCourses(String[] courses) {
        this.courses = courses;
    }

    protected String getCourses() {
        return Arrays.toString(courses);
    }

    protected String getStudentId() {
        return studentId;
    }

    protected String getName() {
        return name;
    }

    protected String getYear() {
        return year;
    }

    private String StudentId(String year) {
        StringBuilder studentId = new StringBuilder(String.valueOf(year.charAt(0)));

        for(int i = 0; i < 4; i++) {
            int studentIdbase = random.nextInt(0, 9);
            studentId.append(studentIdbase);
        }

        return studentId.toString();
    }
}
