package src;
public class PassPercentageCalculator {
    public static void main(String[] args) {
        // Initialize arrays to keep track of pass count and total count for each subject
        int[] passCount = new int[7];
        int[] totalCount = new int[7];

        // Simulate scores for 20 students and 7 subjects (you can replace this with actual data)
        // In this example, we generate random scores between 0 and 100 for each subject.
        for (int student = 0; student < 20; student++) {
            int[] studentScores = new int[7];
            for (int subject = 0; subject < 7; subject++) {
                studentScores[subject] = (int) (Math.random() * 11); // Generate a random score between 0 and 100
                totalCount[subject]++; // Increment total count for the subject
                if (studentScores[subject] >= 5) {
                    passCount[subject]++; // Increment pass count if the student passed
                }
            }
        }

        // Calculate pass percentages
        double[] passPercentage = new double[7];
        for (int subject = 0; subject < 7; subject++) {
            passPercentage[subject] = (double) passCount[subject] / totalCount[subject] * 100;
        }

        // Display results
        for (int subject = 0; subject < 7; subject++) {
            System.out.printf("Pass percentage for Subject %d: %.2f%%%n", subject + 1, passPercentage[subject]);
        }
    }
}
