
    import java.util.Map;

   public class AvarageTask {

        private static int calculateAveragePopulation(Map<String, Integer> population) {
            // WRITE YOUR CODE BELOW THIS LINE
            if(population.isEmpty()){
            return 0;}
             int sumPopul =0;
            for (Map.Entry<String, Integer> item: population.entrySet()){
                int popul=item.getValue();
                sumPopul+=popul;
            }
            return sumPopul/population.size();
            // WRITE YOUR CODE ABOVE THIS LINE
        }

        public static void main(String[ ] args) {
            test(calculateAveragePopulation(Map.of("Ukraine", 42_000_000)), 42_000_000, "singleCountry");
            test(calculateAveragePopulation(Map.of()), 0, "emptyArray");
            test(calculateAveragePopulation(
                    Map.of(
                            "Ukraine", 42_000_000,
                            "Belarus", 9_500_000,
                            "Moldova", 3_500_000,
                            "Switzerland", 8_400_000)),
                    15_850_000,
                    "multipleCountries");

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

