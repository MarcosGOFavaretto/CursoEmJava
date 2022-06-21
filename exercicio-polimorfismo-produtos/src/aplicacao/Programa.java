package aplicacao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ImportedProduct;
import entidades.Product;
import entidades.UsedProduct;
import utilidades.Utils;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int quantity = sc.nextInt();

		List<Product> products = new ArrayList<>();
		for (int i = 1; i <= quantity; i++) {
			System.out.print("Commom, user or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (productType == 'c') {
				products.add(new Product(name, price));
			} else if (productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = Utils.sdf.parse(sc.next());
				products.add(new UsedProduct(name, price, manufactureDate));
			} else if (productType == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : products)
			System.out.println(product.priceTag());

		sc.close();
	}

}