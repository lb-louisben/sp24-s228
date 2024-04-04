import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        int[] dice = new int[6];
        for (int i = 0; i <= 5; ++i) {
            dice[i] = i + 1;
        }
        return dice;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        String[] order = new String[4];
        if (Objects.equals(customer, "Ergun")) {
            order[0] = "beyti";
            order[1] = "pizza";
            order[2] = "hamburger";
            order[3] = "tea";
        } else if (Objects.equals(customer, "Erik")) {
            order[0] = "sushi";
            order[1] = "pasta";
            order[2] = "avocado";
            order[3] = "coffee";
        } else {
            order = new String[3];
        }
        return order;
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // Dont forget the Integer's MIN_VALUE & MAX_VALUE
        int tem_max = Integer.MIN_VALUE, tem_min = Integer.MAX_VALUE;
        for (int j : array) {
            tem_max = Math.max(j, tem_max);
            tem_min = Math.min(j, tem_min);
        }
        return tem_max - tem_min;
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        list.add(x);
        if (x == 1) {
            return list;
        } else if (x % 2 == 0) {
            x /= 2;
        } else {
            x = 3 * x + 1;
        }
        return hailstoneHelper(x, list);
    }
}
