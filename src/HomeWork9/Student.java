package HomeWork9;

import java.util.List;
import java.util.Objects;

public class Student {

    private String name;

    private List<Course> courses;

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public static class Course {

        private String title;


        public Course(String name) {
            this.title = name;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Course room = (Course) o;
            return Objects.equals(title, room.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title);
        }
    }

}
