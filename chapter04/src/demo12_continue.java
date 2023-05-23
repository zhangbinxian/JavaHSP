public class demo12_continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i);
            if (i == 3) {
                continue;
            }
            System.out.print("\t");
        }
    }
}
