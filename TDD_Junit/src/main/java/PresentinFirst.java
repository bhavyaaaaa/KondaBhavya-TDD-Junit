public class PresentinFirst {
    public static String removeAs(String s) {
        if (s.length() == 0)
            return "";
        if (s.length() == 1 && s.charAt(0) == 'A')
            return "";
        if (s.length() == 1 && s.charAt(0) != 'A')
            return s;
        if (s.charAt(1) == 'A')
            s = s.charAt(0) + s.substring(2);
        if (s.charAt(0) == 'A')
            s = s.substring(1);
        return s;
    }
}