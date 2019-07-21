public class PhraseLetterTask {

        private static boolean hasNoneLetters(String blacklist, String phrase) {
            // WRITE YOUR CODE BELOW THIS LINE
                for (int i=0;i<blacklist.length(); i++){
                    for (int j=0; j<phrase.length(); j++){
                        if (Character.toString(blacklist.charAt(i)).equalsIgnoreCase(Character.toString(phrase.charAt(j)))){
                            return false;
                        }
                    }
                }
                return true;
            // WRITE YOUR CODE ABOVE THIS LINE
        }

        public static void main(String[ ] args) {
            test(hasNoneLetters("abcdef", "fgh"), false, "one letter overlap");
            test(hasNoneLetters("abcdef", "gh"), true, "contains none");
            test(hasNoneLetters("ABCD", "def"), false, "pattern case insensitive overlap");
            test(hasNoneLetters("abcd", "DEF"), false, "phrase case insensitive overlap");
        }

        private static void test(boolean actual, boolean expected, String testName) {
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

