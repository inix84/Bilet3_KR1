public class Main {
    public static void main(String[] args) {
        String c = "маринасдалакурсовую";
        int size = c.length();
        System.out.println(size);
            String c1 = c.substring(0,size/2);
            String c2 = c.substring(size/2,size);
            System.out.println(c1 + "/" + c2);
           }
}