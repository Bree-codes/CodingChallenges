public class Solution {

    public String checkingLeapYear(int year){
        if(year % 4 == 0){
            return "This is a leap year";
        }
        return "This is not a leap year!";
    }
}
