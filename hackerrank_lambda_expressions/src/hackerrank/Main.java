package hackerrank;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyMath myMath = new MyMath();
        int t = scanner.nextInt();
        List <String> results = new ArrayList<>();
        while (t-- > 0) {
            int type = scanner.nextInt();
            int num = scanner.nextInt();
            PerformOperation op;
            
            if (type == 1) {
                op = myMath.isOdd();
                results.add(op.check(num) ? "ODD" : "EVEN");
            } else if (type == 2) {
                op = myMath.isPrime();
                results.add(op.check(num) ? "PRIME" : "COMPOSITE");
            } else if (type == 3) {
                op = myMath.isPalindrome();
                results.add(op.check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
        results.forEach(System.out::println);
    }
}

