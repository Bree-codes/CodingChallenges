import java.util.List;

public class Main {
    public static void main(String[] args) {

        int startYear = 1900;
        int endYear = 2030;

        Solution solution = new Solution();
        List<Integer> years = solution.generateLeapYears(startYear,endYear);
        System.out.println("These are the leap years between " + startYear + " and " + endYear + ":" );

        for (int year: years) {
            System.out.println(year);
        }

    }
}
