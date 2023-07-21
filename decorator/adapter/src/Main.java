import com.rgl.adapter.CollegeStudent;
import com.rgl.adapter.SchoolStudent;
import com.rgl.adapter.SchoolStudentAdapter;
import com.rgl.adapter.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("Virat","Kohli","vk18@gmail.com");
        students.add(collegeStudent);
        SchoolStudent schoolStudent = new SchoolStudent("Shubman","Gill","sg47@gmail.com");
//        students.add(schoolStudent); // Cant do
        Student adaptedSchoolStudent = new SchoolStudentAdapter(schoolStudent);
        students.add(adaptedSchoolStudent);
        for (Student s:
             students) {
            System.out.println(s);
        }
    }
}