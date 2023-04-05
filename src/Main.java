public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 2.2");
        int startBalance = 10;
        int topup = 1250;
        int issue = 100;
        int gift = topup / issue;
        int zerobonus = 0;
        int balance = startBalance + topup + gift;

        if (topup >= 1000) {
            System.out.println("gift");
        } else  {
            System.out.println("zerobonus");
        }
        System.out.println(gift);
        System.out.println("total balance");
        System.out.println(balance);

    }
}