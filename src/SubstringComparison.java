import java.util.Scanner;

public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String string = s.substring(i, i + k);
            if (smallest.compareTo(string) > 0) {
                smallest = string;
            }
            if (largest.compareTo(string) < 0) {
                largest = string;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}