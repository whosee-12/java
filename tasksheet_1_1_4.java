public class tasksheet_1_1_4 {
    public static void main(String[] args) {
        int score = 95;

        String grade;
        if (score <= 100 && score >= 90) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        } else {
            grade = "Invalid Score";
        }

        System.out.println("you got " +grade+ " grade ");
    }
}