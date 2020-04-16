import java.util.Scanner;
public class ScoreStatistics {
    public static void main(String[] args) {
        int min = 0, max = 0, sum = 0;
        double avg = 0.0d;
        int score, counter = 0;

        Scanner keybd = new Scanner (System.in);
        System.out.println("Enter a test. Type -1 to quit.");
        score = keybd.nextInt();
        keybd.nextLine();

        while(score != -1) {
            counter += 1;
            if (counter == 1 || score < min)
                min = score;

            if (score > max)
                max = score;

            sum += score;

            System.out.println("Enter a test. Type -1 to quit.");
            score = keybd.nextInt();
            keybd.nextLine();
        }
        if (counter >0)
            avg = sum/counter;

        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
    }
}
