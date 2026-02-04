public class Main {
    public static void main(String[] args) {
        GradeManager.executeGradeReport(40);
        GradeManager.executeGradeReport(85);
        GradeManager.executeGradeReport(70);
        GradeManager.executeGradeReport(55.5);
        GradeManager.executeGradeReport(120);
        
        // calculating for class averages
        System.out.println("\ncalculating class averages...");

        double average1 = GradeManager.calculateClassAverage(50, 70);
        System.out.println("Average of two:" + average1);

        double average2 = GradeManager.calculateClassAverage(25, 58, 35);
        System.out.println("Average of three:" + average2);

        double[] scores = {25, 17, 30, 55, 12, 40};
        double averageArr = GradeManager.calculateClassAverage(scores);
        System.out.println("Average of Arr:" + averageArr);


    }
    
}