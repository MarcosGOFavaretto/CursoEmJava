package entidades;

public class ImportedProduct extends Product {

	private double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	private double totalPrice() {
		return this.getPrice() + this.getCustomsFee();
	}

	@Override
	public String priceTag() {
		return this.getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ "
				+ String.format("%.2f", this.getCustomsFee()) + ")";
	}
}
