package entidades;

import java.util.Date;

import utilidades.Utils;

public class UsedProduct extends Product {

	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return this.getName() + " (used) $ " + String.format("%.2f", this.getPrice()) + " (Manufacture date: "
				+ Utils.formatDate(getManufactureDate()) + ")";
	}
}