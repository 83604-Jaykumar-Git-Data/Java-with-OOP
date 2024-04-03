import java.util.Scanner;

public class Invoice {
	private String PartNo;
	private String PartDesc;
	private int Qty;
	private double Price;
	
	public Invoice() {
		PartNo="";
		PartDesc="";
		Qty=0;
		Price=0.0;
	}
//	public Invoice(String PartNo,String PartDesc,int Qty,double Price) {
//		
//	}
	
	
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
	
	public void acceptInvoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter partno: ");
		PartNo = sc.next();
		System.out.println("Enter partDesc: ");
		PartDesc = sc.next();
		System.out.println("Enter qty: ");
		Qty = sc.nextInt();
		System.out.println("Enter Price: ");
		Price = sc.nextDouble();
	}
	
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

	public void displayInvoice() {
		System.out.println("Part no: "+PartNo);
		System.out.println("PartDesc: "+PartDesc);
		System.out.println("Qty:"+Qty);
		System.out.println("Price: "+Price);
	}
}
