public class demo13_BasicToString {
    public static void main(String[] args) {
        String s1 = "100";
        String s2 = "3.14F";
        String s3 = "3.1415";
        String s4 = "true";

        int n1 = Integer.parseInt(s1);
        float f1 = Float.parseFloat(s2);
        double d1 = Double.parseDouble(s3);
        boolean b1 = Boolean.parseBoolean(s4);

        System.out.println(n1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(b1);

        System.out.println("abc".charAt(0));
    }
}
