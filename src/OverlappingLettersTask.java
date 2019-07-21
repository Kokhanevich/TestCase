import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class OverlappingLettersTask {


        private static Set<Character> getOverlappingLetters(String first, String second) {
            // WRITE YOUR CODE BELOW THIS LINE
            Set<Character> res = new HashSet();
            for (int i=0;i<first.length(); i++){
                for (int j=0; j<second.length(); j++){
                    if (Character.toString(first.charAt(i)).equalsIgnoreCase(Character.toString(second.charAt(j)))){
                         res.add(second.charAt(j));
                    }
                }
            }
            return res;
            // WRITE YOUR CODE ABOVE THIS LINE
        }

        public static void main(String[ ] args) {
            test(getOverlappingLetters("a", "b"), Collections.EMPTY_SET, "empty overlap");
            test(getOverlappingLetters("aa", "a"), Set.of('a'), "duplicated string in overlap");
            test(getOverlappingLetters("A", "a"), Set.of('a'), "case insensitive overlap");
            test(
                    getOverlappingLetters("Happy New Year", "nyhz"),
                    Set.of('h', 'y', 'n'),
                    "simple phrase");
        }

        private static void test(Set<Character> actual, Set<Character> expected, String testName) {
            if (!expected.equals(actual)) {
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

