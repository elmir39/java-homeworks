package hackerrank;

public class MyMath {
    public PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }

    public PerformOperation isPrime() {
        return a -> {
            if (a < 2) {
                return false;
            }
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return a -> {
            String str = Integer.toString(a);
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        };
    }
}
