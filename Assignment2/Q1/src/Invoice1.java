import java.util.Scanner;

public class Invoice1 {
	private String PartNo;
	private String PartDesc;
	private int Qty;
	private double Price;
	
	Scanner sc = new Scanner(System.in);
	
	public Invoice1() {
		PartNo="";
		PartDesc="";
		Qty=0;
		Price=0.0;
	}
	
	public Invoice1(String partNo, String partDesc, int qty, double price) {
		this.PartNo = partNo;
		this.PartDesc = partDesc;
		this.Qty = qty;
		this.Price = price;
	}

	public String getPartNo() {
		return PartNo;
	}


	public void setPartNo(String partNo) {
		PartNo = partNo;
	}


	public String getPartDesc() {
		return PartDesc;
	}


	public void setPartDesc(String partDesc) {
		PartDesc = partDesc;
	}


	public int getQty() {
		return Qty;
	}


	public void setQty(int qty) {
		Qty = qty;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}
	
	public Invoice1 accept() {
		System.out.println("Enter the Product details: ");
		return new Invoice1(sc.next(), sc.next(), sc.nextInt(),sc.nextDouble());
	}
	
//	public void acceptInvoice() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter partno: ");
//		PartNo = sc.next();
//		System.out.println("Enter partDesc: ");
//		PartDesc = sc.next();
//		System.out.println("Enter qty: ");
//		Qty = sc.nextInt();
//		System.out.println("Enter Price: ");
//		Price = sc.nextDouble();
//	}
	
	public void calculateAmount() {
		if(Qty < 0) {
			setQty(0);
			System.out.println("Enter correct Qty!!!!!");
		}
		else if(Price < 0) {
			setPrice(0.0);
			System.out.println("Enter correct Price!!!!!");
		}
		else {
			System.out.println("total amount: "+(Qty * Price));
		}
	}
}
