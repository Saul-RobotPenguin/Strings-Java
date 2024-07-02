import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        String status;

        if (A.compareTo(B) > 0) {
            status = "Yes";
        } else {
            status = "No";
        }

        System.out.println(A.length() + B.length());
        System.out.println(status);
        System.out.print(A.substring(0, 1).toUpperCase() + A.substring(1));
        System.out.print(" ");
        System.out.print(B.substring(0, 1).toUpperCase() + B.substring(1));

    }
}
