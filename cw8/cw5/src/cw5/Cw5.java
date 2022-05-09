package cw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


class SklepOnline {
	@SuppressWarnings("unchecked")
	private final List<HashMap<String, Object>> products = new ArrayList() {
		{
			add( new HashMap<>() {{
				put("name", "Sok pomarańczowy");
				put("price", 6.50);
				put("qty", 100);
			}});
			add( new HashMap<>() {{
				put("name", "Woda Polaris niegaz");
				put("price", 0.99);
				put("qty", 500);
			}});
			add( new HashMap<>() {{
				put("name", "Filet z kurczaka");
				put("price", 16.89);
				put("qty", 100);
			}});
		}
	};
	
	private List<HashMap<String, Object>> userBasket = new ArrayList<HashMap<String, Object>>();
	
	private String normalize(String str) {
		return str.trim().toLowerCase();
	}
	
	public HashMap<String, Object> getProduct(String name) {
		for (HashMap<String, Object> product : products) {
			if( normalize( product.get("name").toString() ).equals( normalize(name) )) {
				return product;
			}
		}
		return null;
	}
	
	private void remove(HashMap<String, Object> product) {
		products.remove(product);
	}
	
	public void addToBasket(String product, int qty) {
		HashMap<String, Object> p = getProduct(product);
		if(Objects.nonNull( p )) {
			HashMap<String, Object> userProduct = (HashMap<String, Object>) p.clone();
			int pQty =  Integer.parseInt( p.get("qty").toString() );
		
			int newQty = pQty - qty;
			if(newQty <= 0) {
				newQty = pQty;;
				qty = pQty;
				System.out.println("Niestety zabrakło nam tego produktu, więc tylko " + newQty +" " + product + " " + " zostało dodane do koszyka");
				remove(p);
			}
			userProduct.replace("qty", qty);
			userProduct.put("total_price", qty *  Double.parseDouble( p.get("price").toString() ));
			userBasket.add(userProduct);
			
			p.replace("qty", newQty);
		} else {
			System.out.println("Nie ma takiego produkta w sklepie");
		}
	}
	
	public List<HashMap<String, Object>> getBasket() {
		return userBasket;
	}
	
	public double getBasketTotalPrice() {
		double totalPrice = 0;
		for(HashMap<String, Object> bP : getBasket()) {
			totalPrice += Double.parseDouble( bP.get("total_price").toString() );
		}
		return totalPrice;
	}
	
	public String getProductList() {
		String string = "";
		for(HashMap<String, Object> bP : getProducts()) {
			string += bP.get("name").toString() + " ";
		}
		return string;
	}
	
	public List<HashMap<String, Object>> getProducts() {
		return products;
	}
}

public class Cw5 {
	public static void main(String[] args) {
		SklepOnline sklep = new SklepOnline();
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("product list: " + sklep.getProductList());
			System.out.print("wpisz product jakiej chcesz dobawic do koszyka: ");
			String productName = scanner.nextLine();
			System.out.print("Wpisz ilosc: ");
			int qty = scanner.nextInt();
			
			sklep.addToBasket(productName, qty);

			System.out.println("Twoj koszyk: ");
			System.out.println( sklep.getBasket() );
			System.out.println("Total price: " + sklep.getBasketTotalPrice());
			
			scanner.reset();
		}
	}
}
