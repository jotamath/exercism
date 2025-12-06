public class LogLevels {
    public static String message(String logLine) {
        int index = logLine.indexOf("]: ");
        String result = logLine.substring(index + 3);
        return result.trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        String level = logLine.substring(start, end).toLowerCase();
        return level;
    }

    public static String reformat(String logLine) {
        String a = message(logLine);
        String b = logLevel(logLine);

        return a + " (" + b + ")";
    }
}