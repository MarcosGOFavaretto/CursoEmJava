package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Client;
import entidades.Order;
import entidades.OrderItem;
import entidades.Product;
import entidades.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {

		String name = null;
		String email = null;
		String birthDate = null;
		String status = null;
		Integer itemsQuantity = null;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		birthDate = sc.nextLine();

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Client client = new Client(name, email, sdf1.parse(birthDate));

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		status = sc.nextLine();
		System.out.print("How many items to this order? ");
		itemsQuantity = sc.nextInt();
		sc.nextLine();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

		System.out.println();
		for (int i = 1; i <= itemsQuantity; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			sc.nextLine();

			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			order.addItem(orderItem);
		}

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + sdf2.format(order.getMoment()));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + client.getName() + " (" + sdf1.format(client.getBirthDate()) + ") - " + client.getEmail());
		System.out.println("Order items:");

		for (OrderItem item : order.getItems()) {
			StringBuilder s = new StringBuilder();
			s.append(item.getProduct().getName() + ", ");
			s.append("$" + item.getProduct().getPrice() + ", ");
			s.append("Quantity: " + item.getQuantity() + ", ");
			s.append("Subtotal: $" + item.subTotal());

			System.out.println(s.toString());
		}

		System.out.println("Total price: $" + order.total());

		sc.close();
	}

}
