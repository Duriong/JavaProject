package ch14;

import java.util.Scanner;

public class Product {
	private String number;//제품번호
	private String productName;//제품명
	private String company;//제조사
	private int price;//단가
	private int amount;//판매수량
	private int money;//판매금액(단가x판매수량)
	
	public void input() {
		Scanner scan =  new Scanner(System.in);
		System.out.print("제품번호 : ");
		number = scan.next();
		System.out.print("제품명 : ");
		productName = scan.next();
		System.out.print("제조사 : ");
		company = scan.next();
		System.out.print("단가 : ");
		price = scan.nextInt();
		System.out.print("수량 : ");
		amount = scan.nextInt();
		
		money = price*amount;
	}
	//getter,setter
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public Product() {
		
	}
	
	public Product(String number, String productName, String company, int price, int amount, int money) {
		super();
		this.number = number;
		this.productName = productName;
		this.company = company;
		this.price = price;
		this.amount = amount;
		this.money = money;
	}
}
