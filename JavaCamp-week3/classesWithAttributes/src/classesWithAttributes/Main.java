package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(2, "Tv", "vestel tv", 1500, 5, "blue");
		/*Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(7850);
		product.setStockAmount(157);*/
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getKod());
	}

}
