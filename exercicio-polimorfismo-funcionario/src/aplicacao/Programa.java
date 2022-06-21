package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;
import entidades.OutsourcedEmployee;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int numEmployees = sc.nextInt();

		List<Employee> employees = new ArrayList<>();
		for (int i = 1; i <= numEmployees; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char isOutsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (isOutsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employee : employees)
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));

		sc.close();

	}

}
