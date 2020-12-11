package hacker_rank.algorithms.easy;

public class TimeConversion {

    public static void main(String[] args) {

        //  AM z łac. ante meridiem – przed południem,
        //  PM z łac. post meridiem – po południu.

//        System.out.println(timeConversion("12:00:00AM"));
//        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:45:54PM"));
    }

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0,2));
        String minAndSeconds = s.substring(2,8);
        StringBuilder sb = new StringBuilder();
        String hourType = s.substring(8,10);

        if(hourType.equals("AM") && hour!=12) {
            return s.substring(0,8);
        } else if (hourType.equals("AM")){
            sb.append("00").append(minAndSeconds);
        }
        else {
            if(hour < 12) {
                hour+=12;
                sb.append(hour).append(minAndSeconds);
            } else {
                return s.substring(0,8);
            }
        }
        return sb.toString();
    }

}
