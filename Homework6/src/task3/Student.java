package task3;

//Write class Student that provides information about the name of the student and his course. Class Student should
// consist of properties for access to these fields constructor with parameters
//method printStudents (List students, Integer course), which receives a list of students and the course number and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
//methods to compare students by name and by course
//In the main() method
//declare List students and add to the list five different students
//display the list of students ordered by name
//display the list of students ordered by course.

import java.util.*;

public class Student {
    private String name;
    private  int course;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", course = " + course +
                '}';
    }
    private static Comparator <Student> compareByName = (o1, o2) -> {
        return o1.getName().compareTo(o2.getName());
    };
    private static Comparator<Student> compareByCourse = (o1, o2) -> {
        return o1.getCourse() - o2.getCourse();
    };

    public static void printStudents(List<Student> studentsList,Integer course) {
        Iterator iterator = studentsList.iterator();
           while (iterator.hasNext()) {
                   Student student = (Student) iterator.next();
                   if (student.getCourse() == course){
                       System.out.println(student);
                   }
           }
    }
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student("Savchuk", 2));
        studentsList.add(new Student("Vavryn", 3));
        studentsList.add(new Student("Pavliv", 1));
        studentsList.add(new Student("Ivankiv", 3));
        studentsList.add(new Student("Mukhailijuk", 3));

        printStudents(studentsList, 3);

        System.out.println("Sort by name");
        Collections.sort(studentsList,compareByName);
        for (int i = 0; i <studentsList.size() ; i++) {
            System.out.println(studentsList.get(i));
        }
        System.out.println("Sort by course");
        Collections.sort(studentsList,compareByCourse);
        for (int i = 0; i <studentsList.size() ; i++) {
            System.out.println(studentsList.get(i));
        }
    }
}


