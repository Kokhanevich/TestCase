/**
 * Created by Николай on 20.07.2019.
 */
public class LastCharacterTask {
        private static char getLastCharacter(String input) {
            // WRITE YOUR CODE BELOW THIS LINE
            char x= input.charAt(input.length()-1);
            return x;
            // WRITE YOUR CODE ABOVE THIS LINE
        }

        public static void main(String[ ] args) {
            test(getLastCharacter("a"), 'a', "\"a\" last character");
            test(getLastCharacter("abcde"), 'e', "abcde last character");
            test(getLastCharacter("12345"), '5', "12345 last character");
        }

        private static void test(char actual, char expected, String testName) {
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

