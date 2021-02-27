package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<Order> orders = new ArrayList<>();
		OrderService os = new OrderService();

		DurableProduct d1 = new DurableProduct(101, DurableProduct.Type.LUNCHBOX,500.0);
		DurableProduct d2 = new DurableProduct(102, DurableProduct.Type.SHOES, 2000.0);

		ConsumableProduct c1 = new ConsumableProduct(103,ConsumableProduct.Type.BURGER,50.0,LocalDate.now().plusDays(2));
		ConsumableProduct c2 = new ConsumableProduct(104,ConsumableProduct.Type.BREAD,60.0,LocalDate.now().plusDays(5));

		Order order1 = new Order(2, d1, LocalDate.now(), "Purchase");
		Order order2 = new Order(2, c1, LocalDate.now(), "Purchase");

		Order order3 = new Order(2, d1, LocalDate.now(), "Sales");
		Order order4 = new Order(2, c1, LocalDate.now(), "Sales");

		Order order5 = new Order(10, d2, LocalDate.now(), "Purchase");
		Order order6 = new Order(20, c2, LocalDate.now(), "Purchase");

		Order order7 = new Order(2, d2, LocalDate.now(), "Sales");
		Order order8 = new Order(4, c2, LocalDate.now(), "Sales");

		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		orders.add(order6);
		orders.add(order7);
		orders.add(order8);

		try {
			os.execute(orders);
		} catch (Exception e) {

			System.out.println(e.getMessage());


		}

		Map<Integer,Integer> inventory = os.getInventory();

		System.out.println("\nOrders = ");

		os.getAllOrders().stream().forEach(System.out::println);

		System.out.println("\nProducts = ");

		os.getAllProducts().stream().forEach((p)-> {
			System.out.println(p + " Quantity = " + inventory.get(p.getId()));
		});

		//System.out.println(d1.type);

	}

}