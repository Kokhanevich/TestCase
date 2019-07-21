/**
 * Created by Николай on 20.07.2019.
 */
public class StringLengthTask {
    private static int stringLength(String input)  {
        // WRITE YOUR CODE BELOW THIS LINE
        if (input==null){
            return 0;
        }
        int x=input.length();
        return x;
        // WRITE YOUR CODE ABOVE THIS LINE
    }

    public static void main(String[ ] args) {
        test(stringLength(null), 0, "length of null");
        test(stringLength(""), 0, "length of empty string");
        test(stringLength("AAA"), 3, "length of AAA");
    }

    private static void test(int actual, int expected, String testName) {
        if (actual != expected) {
            String errorMessage = String.format(
                    "Test %s failed: %d is not equal to expected %d",
                    testName,
                    actual,
                    expected);
            System.out.println("ERROR: " + errorMessage);
        } else {
            System.out.println("SUCCESS: " + testName + " passed");
        }
    }
}
