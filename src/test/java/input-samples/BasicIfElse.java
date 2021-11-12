public class BasicIfElse {
    String bacicIfElseMethod(int hour) {
        String time = "";

        if (hour < 12) {
            time = "morning";
            System.out.println("morning.");
        } else if (hour < 18) {
            time = "noon";
            System.out.println("noon.");
        } else {
            time = "night";
            System.out.println("night.");
        }

        String prefix = "good";
        time = prefix + " " + time;
        return time;
    }
}
