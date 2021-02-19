package test;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Item items[] = new Item[2];
		items[0] = new Item("C_101","HUAWEI Mate30 Pro",5000.00);
		items[1] =new Item("C_102","XIAOMI 10 Pro",4699.00);
		System.out.println("请输入商品编号和数量（用英文逗号隔开）");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] nums = str.split(",");
		in.close();
		for(int i = 0;i<items.length;i++) {
			if(items[i].getItemCode().equals(nums[0])) {
				Order order = new Order(items[i],Integer.parseInt(nums[1]));
				order.getOrderAmount();
				return;
			}
		}
		System.out.println("输入错误!");
	}
}
class Item{
	private String itemCode;//商品编号
	private String itemName;//商品名称
	private double unitPrice;//商品单价
	public Item(String itemCode,String itemName, double unitPrice) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
	}
	public String getItemCode() {
		return itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public double getUnitPrice(){
		 return unitPrice;
	}
}

class Order {
	int itemCount;//商品数量
	Item items;
	public Order(Item items, int itemCount) {
		this.items = items;
		this.itemCount = itemCount;
	}
	
	public Item getItem() {
		return items;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void getOrderAmount(){
		System.out.println((items.getUnitPrice())*itemCount);
	}
}