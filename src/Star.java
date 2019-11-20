public class Star {
    public static void main(String[] args) throws InterruptedException {
        int n = 10;
        for (int ps = 1; ps <= n; ps++) {
            System.out.print("\r");

            for (int i = 1; i <= ps; i++) {
                System.out.print(" ");

            }
            System.out.print("*");
            Thread.sleep(250);
        }
        for (int back = 1; back <= 10; back++) {
            for (int ps = 1; ps <= back; ps++) {
                System.out.print("\r");

                for (int i = 1; i <= ps; i++) {
                    System.out.print(" ");

                }
                System.out.print("*");
            }
            Thread.sleep(250);
        }
//        System.out.print("*");
    }
}
