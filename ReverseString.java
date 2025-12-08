public class ReverseString {
    public static void main(String[] args) {
        // Reverse a String
        // diff b/w String and StringBuffer
        // do we have a reverse Function in String?
        String s = "Selenium";
        int len = s.length();
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);

        }
        System.out.println(rev);
        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());

    }
}
