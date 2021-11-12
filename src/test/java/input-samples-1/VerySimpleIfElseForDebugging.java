public class BasicIfElse {
    String bacicIfElseMethod(int hour) {
        String time = "";

        if (hour < 18) {
            time = "day";
            System.out.println("day.");
        } else if (hour < 18) {
            time = "night";
            System.out.println("night.");
        }

        String prefix = "good";
        time = prefix + " " + time;
        return time;
    }
}
