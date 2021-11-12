public class CanItHandleLastWrite {
    String ifElseMethodCanHandleLastWrite(int hour) {
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
        time = "overwrite time";
        time = prefix + " " + time;
        return time;
    }
}
