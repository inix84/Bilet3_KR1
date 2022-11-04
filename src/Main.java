public class Main {
    public static void main(String[] args) {
        String c = "маринасдалакурсовую";
        int number = c.length();
        System.out.println(number);
            String c1 = c.substring(0,number/2);
            String c2 = c.substring(number/2,number);
            System.out.println(c1 + "/" + c2);
           }
}