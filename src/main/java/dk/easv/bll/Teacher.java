package dk.easv.bll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Teacher extends Person{
    private String initials;
    private ArrayList<String> subjects = new ArrayList<>();
    private double salary = 0;

    public Teacher(int id, String name, String initials) {
        super(id, name);
        this.initials = initials;
        //createInitials(name);
    }


    @Override
    public String toString() {
        if (!subjects.isEmpty())
            return id  + "\t" + name + "\t" + initials + "@easv.dk" + "\t" + initials + "\n" + subjects.getFirst();
        else
            return id  + "\t" + name + "\t" + initials + "@easv.dk" + "\t" + initials + "\n";

    }

    private void createInitials(String name) {
        for (String s : name.split(" ")) {
            if (!s.isEmpty()) {
                initials += s.charAt(0);
            }
        }
        initials = initials.toLowerCase();
    }

    public void addSubject(String[] subject) {
        subjects.addAll(Arrays.asList(subject));
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getInitials() {
        return initials;
    }
    public void setInitials(String initials) {
        this.initials = initials;
    }
}
