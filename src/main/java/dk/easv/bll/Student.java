package dk.easv.bll;

import dk.easv.bll.GradeInfo;

import java.text.DecimalFormat;
import java.util.List;

public class Student extends Person {
    private List<GradeInfo> gradeReport;
    private String education;

    public Student(int id, String name, String education) {
        super(id, name);
        this.education = education;
    }
    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }
    public void setGradeReport(List<GradeInfo> gradeReport) {
        this.gradeReport = gradeReport;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public double getAverageGrade() {
        double sum = 0;
        int count = 0;
        for (GradeInfo gradeInfo : gradeReport) {
            sum += gradeInfo.getGrade();
            count++;
        }
        return sum / count;
    }

    @Override
    public String toString() {
        String[] e = name.split(" ");
        String email = "";
        for (int i = 0; i < e.length; i++) {
            if (i == 0)
                email += e[i].charAt(0);
            else {
                email += e[i].charAt(0);
                email += e[i].charAt(1);
            }
        }

        return id + "\t" + name + "\t" + email.toLowerCase() + "@easv.dk \t" + education + "\t" + String.format( "%.2f", getAverageGrade());
    }
}
