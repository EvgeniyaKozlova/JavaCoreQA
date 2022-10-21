package HomeWork9;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> result = getList ();

        result.stream().flatMap(student -> student.getCourses().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(student -> student.getCourses().stream()).collect(Collectors.toSet());


        result.stream().sorted((student1,student2) -> student1.getCourses().size() - student2.getCourses().size()).limit(3).collect(Collectors.toList());


        Student.Course paramCourse = new Student.Course("курс");
        result.stream().filter(student -> student.getCourses().contains(paramCourse)).collect(Collectors.toList());

        System.out.println();


    }

    private static List<Student> getList(){
        List<Student> students = new ArrayList<>();
        Faker faker = new Faker();
        Random random = new Random(20);
        for(int i =0; i<100;i++){
            Random randomCourse = new Random();
            List<Student.Course> courses = new ArrayList<>();
            for(int j=0;j<randomCourse.nextInt(4); j++){
                courses.add(new Student.Course(faker.educator().course()));
            }

            Student student = new Student(faker.name().fullName(), courses);
            students.add(student);
        }
        return students;
    }

}

