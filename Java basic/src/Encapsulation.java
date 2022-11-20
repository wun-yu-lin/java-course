public class Encapsulation {
    //field
    private int score;
    private String studentName;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public Encapsulation(int score, String studentName ){
        this.score = score;
        this.studentName = studentName;
    }


}
