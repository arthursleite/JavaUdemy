package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Client c1 = new Client();
        OrderItem oi1 = new OrderItem();
        Order o1 = new Order();
        Product p1 = new Product();
        
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        c1.setName(sc.next());
        System.out.print("Email: ");
        c1.setEmail(sc.next());
        System.out.print("Birth date (DD/MM/YYYY): ");
//        c1.setbirthDate(sdf.parse(sc.next()));
        
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();
        o1.setStatus(OrderStatus.valueOf(status));
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter #1 item data:");
            System.out.print("Product name: ");
            p1.setName(sc.next());
            System.out.print("Product price: ");
            p1.setPrice(sc.nextDouble());
            System.out.print("Quantity: ");
            oi1.setQuantity(sc.nextInt());
            
            System.out.println("ORDER SUMMARY:");
            System.out.print("Order moment: ");
        }
    }

}
