/**
 * Created by Николай on 20.07.2019.
 */
public class SmallestElementTask {

        private static int findSmallestElement(int[] nums) {
            // WRITE YOUR CODE BELOW THIS LINE
            if(nums.length==0){
                return 0;
            }
            int min = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
            return min;
            // WRITE YOUR CODE ABOVE THIS LINE
        }


            public static void main(String[ ] args) {
            test(findSmallestElement(new int[]{0}), 0, "arrayWithOneElement");
            test(findSmallestElement(new int[0]), 0, "emptyArray");
            test(findSmallestElement(new int[]{1, 1, 1, 1}), 1, "arrayWithSameElements");
            test(findSmallestElement(new int[]{1, 2, 3, 4}), 1, "arrayWithLargestElementInTheEnd");
            test(findSmallestElement(new int[]{1, 4, 3, 2}), 1, "arrayWithLargestElementInTheMiddle");
            test(findSmallestElement(new int[]{-1, -4, -3, -2}), -4, "arrayWithNegativeElements");
        }

        private static void test(int actual, int expected, String testName) {
            if (actual != expected) {
                String errorMessage = String.format(
                        "Test %s failed: %s is not equal to expected %s",
                        testName,
                        actual,
                        expected);
                System.out.println("ERROR: " + errorMessage);
            } else {
                System.out.println("SUCCESS: " + testName + " passed");
            }
        }
    }

