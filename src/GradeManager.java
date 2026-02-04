public class GradeManager {
    public static void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("invalid score.");
        }
        else {
            char grade = calculateLetterGrade(score);
            displayPerformance(grade);
        }
    }
    public static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }
    public static char calculateLetterGrade(double score) {
        if (score >= 80) { return 'A';}
        else if (score >= 70) { return 'B';}
        else if (score >= 60) { return 'C';}
        else if (score >= 50) { return 'D';}
        else { return 'F';}
    } 
    public static void displayPerformance(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
