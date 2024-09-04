package DevOnAc.P08Arrays.Lect;

public class WeekDay {
    public static void main(String[] args) {
        var day = 0;

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        var result = day >= 1 && day <= 7 ? days[day - 1] : "invalid day: " + day;

        System.out.println(result);
    }
}
