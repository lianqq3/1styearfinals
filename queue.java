import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Customer {
    private String name;
    private String tname;

    public Customer(String name, String transaction) {
        this.name = name;
        this.tname = transaction;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Customer> customerQueue = new LinkedList<>();

        while (true) {
            System.out.println("1. Add Customer to Queue");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. View Next Customer");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Customer customer1 = new Customer("Eymard", "Transaction1");
                    Customer customer2 = new Customer("Ysabel", "Transaction #2");
                    Customer customer3 = new Customer("Dave", "Transaction #3");

                    customerQueue.add(customer1);
                    customerQueue.add(customer2);
                    customerQueue.add(customer3);
                    break;

                case 2:
                    if (!customerQueue.isEmpty()) {
                        Customer servedCustomer = customerQueue.poll();
                        System.out.println("Serving: " + servedCustomer.getName());
                    } else {
                        System.out.println("No more in queue");
                    }
                    break;

                case 3:
                    if (!customerQueue.isEmpty()) {
                        Customer nextCustomer = customerQueue.peek();
                        System.out.println("Next in Line:" + nextCustomer.getName());
                    } else {
                        System.out.println("No more in queue");
                    }
                    break;

                case 4:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
            }
        }
    }
}
