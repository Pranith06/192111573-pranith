import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perfect Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        List<Integer> result = new ArrayList<>();
        for (int i = lowerRange; i <= upperRange; i++)
            if ((int) Math.sqrt(i) * (int) Math.sqrt(i) == i && digitSum(i) < 10)
                result.add(i);

        System.out.println(result);

        scanner.close();
    }

    private static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}