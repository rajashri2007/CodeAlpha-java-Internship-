import java.util.*;

class Stock {
    String name;
    double price;
    int quantity;

    Stock(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
}

public class StockTradingPlatform {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock tcs = new Stock("TCS", 3500);
        Stock infosys = new Stock("INFOSYS", 1800);

        double balance = 100000;
        int choice;

        do {
            System.out.println("\n--- STOCK TRADING PLATFORM ---");
            System.out.println("1. Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("TCS     : Rs." + tcs.price);
                    System.out.println("INFOSYS : Rs." + infosys.price);
                    break;

                case 2:
                    System.out.print("Enter 1 for TCS, 2 for INFOSYS: ");
                    int b = sc.nextInt();

                    Stock buy = (b == 1) ? tcs : infosys;

                    System.out.print("Enter quantity: ");
                    int q = sc.nextInt();

                    if (q * buy.price <= balance) {
                        balance -= q * buy.price;
                        buy.quantity += q;
                        System.out.println("Stock bought successfully.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.print("Enter 1 for TCS, 2 for INFOSYS: ");
                    int s = sc.nextInt();

                    Stock sell = (s == 1) ? tcs : infosys;

                    System.out.print("Enter quantity: ");
                    q = sc.nextInt();

                    if (q <= sell.quantity) {
                        sell.quantity -= q;
                        balance += q * sell.price;
                        System.out.println("Stock sold successfully.");
                    } else {
                        System.out.println("Not enough stocks.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- PORTFOLIO ---");
                    System.out.println("TCS Quantity: " + tcs.quantity);
                    System.out.println("INFOSYS Quantity: " + infosys.quantity);
                    System.out.println("Balance: Rs." + balance);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}