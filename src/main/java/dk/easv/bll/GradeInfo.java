package dk.easv.bll;

import java.text.DecimalFormat;
import java.text.Format;

public class GradeInfo {
    private String subject;
    private int grade = 8;

    public GradeInfo(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return subject + "\t" + grade;
    }
}
