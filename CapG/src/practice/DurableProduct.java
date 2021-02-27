package practice;

public class DurableProduct extends Product {

	enum Type
	{
		TOOTHBRUSH,BUCKET,SHOES,LUNCHBOX	
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	Type type;

	public DurableProduct() {
		super();
	}

	public DurableProduct(Integer id, Type type, Double price) {
		super(id, price);

		this.type = type;
	}

	@Override
	public String toString() {
		return "Durable [type=" + type + ", getId()=" + getId() + ", getPrice()=" + getPrice() + "]";
	}





}
