package example.reportcardapp;

/**
 * Created by Administrator on 2016-07-31.
 */
public class ReportCard {

    private String name;
    private String grade;

    @Override
    public String toString() {
        return "Single{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public ReportCard(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }


}
