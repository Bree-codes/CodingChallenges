import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> generateLeapYears(int startYear, int endYear){
        List<Integer> leapYears = new ArrayList<>();

        for(int year = startYear ; year <= endYear ; year++){
            if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
                leapYears.add(year);
            }
        }
        return leapYears;
    }
}
