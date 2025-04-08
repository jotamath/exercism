public static class LogAnalysis 
{
    // TODO: define the 'SubstringAfter()' extension method on the `string` type
    public static string SubstringAfter(this string str, string separator) {
        if (string.IsNullOrEmpty(str) || string.IsNullOrEmpty(separator))
            return str;

        int index = str.IndexOf(separator, StringComparison.Ordinal);
        if (index < 0)
            return str;

        return str.Substring(index + separator.Length);
    }

    // TODO: define the 'SubstringBetween()' extension method on the `string` type
    public static string SubstringBetween(this string str, string start, string end) {
        if (string.IsNullOrEmpty(str) || string.IsNullOrEmpty(start) || string.IsNullOrEmpty(end))
            return str;

        int startIndex = str.IndexOf(start, StringComparison.Ordinal);
        if (startIndex < 0)
            return str;

        int endIndex = str.IndexOf(end, startIndex + start.Length, StringComparison.Ordinal);
        if (endIndex < 0)
            return str;

        return str.Substring(startIndex + start.Length, endIndex - startIndex - start.Length);
    }
    
    // TODO: define the 'Message()' extension method on the `string` type
    public static string Message(this string str) {
        if (string.IsNullOrEmpty(str))
            return str;

        return str.SubstringAfter("]: ").Trim();
    }

    // TODO: define the 'LogLevel()' extension method on the `string` type
    public static string LogLevel(this string str) {
        if (string.IsNullOrEmpty(str))
            return str;

        return str.SubstringBetween("[", "]").Trim();
    }
}