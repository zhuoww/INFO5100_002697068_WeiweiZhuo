package Exercises.exercise4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {
        String string1 = "Life is an act of letting go";
        String string2 = "5678aab 1234AAB";
        String string3 = "zzz.y@northeastern.edu";
        String string4 = "US Phone Numbers: 206-456-9891";
        String string5 = "ID:003339527";

        String pattern1 = "\\bis\\b";
        String pattern2 = "\\b\\d+[A-Z]{2}";
        String pattern3 = "^\\w+@\\w+\\.\\w+$";
        String pattern4 = "\\d{3}-\\d{3}-\\d{4}";
        String pattern5 = "0{2}\\d{7}";

        check(string1, pattern1);
        check(string2, pattern2);
        check(string3, pattern3);
        check(string4, pattern4);
        check(string5, pattern5);
    }

    private static void check(String string, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(string);

        if (m.find()) {
            System.out.println("Found Value: " + m.group(0));
        }else {
            System.out.println("No Match");
        }

    }
}
