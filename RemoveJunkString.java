public class RemoveJunkString {
    public static void main(String[] args) {
        String s = "$$#$12345&*%";
        String s1 = "%$%%^&*&*Testing^%$%%Selenium&&&&";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        System.out.println(s1);
    }
}
