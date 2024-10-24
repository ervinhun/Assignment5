package dk.easv;

import dk.easv.bll.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonController {
    private List<Person> persons = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public PersonController() {
        Teacher p1 = new Teacher(101, "Niels Hansen", "nha");
        Teacher p2 = new Teacher(100, "Ib Boesen", "ibo");
        Teacher p3 = new Teacher(102, "Jeppe Teacher Of The Year", "jpe");
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        Teacher teacher1 = new Teacher(202, "Jeppppppee H", "brr");
        teacher1.addSubject(new String[]{"JavaFX", "Programming", "Wombat"});
        Teacher teacher2 = new Teacher(203, "Henrik the Cool", "htc");
        teacher2.addSubject(new String[]{"SDE1", "Programming", "Yeah", "Hello"});
        teachers.add(teacher1);
        teachers.add(teacher2);
        Student student1 = new Student(110, "Ervin Bacsko", "CS");
        List<GradeInfo> g1 =new ArrayList<>();
        g1.add(new GradeInfo("CS", 10));
        g1.add(new GradeInfo("BDE", 9));
        g1.add(new GradeInfo("IBD", 12));
        student1.setGradeReport(g1);
        students.add(student1);
        Student student2 = new Student(111, "Emre Turkish", "CS");
        List<GradeInfo> g2 =new ArrayList<>();
        g2.add(new GradeInfo("CS", 4));
        g2.add(new GradeInfo("BDE", 6));
        g2.add(new GradeInfo("IBD", 9));
        student2.setGradeReport(g2);
        students.add(student2);
        Student student3 = new Student(112, "Tamas Magy", "WD");
        List<GradeInfo> g3 =new ArrayList<>();
        g3.add(new GradeInfo("CS", 10));
        g3.add(new GradeInfo("BDE", 4));
        g3.add(new GradeInfo("IBD", 7));
        student3.setGradeReport(g3);
        students.add(student3);
        persons.addAll(persons);
        persons.addAll(teachers);
        persons.addAll(students);
    }

    public Person getPerson (int id) {
        for (Person p : persons) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void addPerson (Person person) {
        persons.add(person);
    }

    public void removePerson (int id) {
        persons.remove(id);
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void operation() {
        Menu menu = new MenuSchool("Choose an option (Exit with 0)", new String[]{"Add", "Delete", "Get"});
        menu.run();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        menu.doAction(choice);

    }
}
