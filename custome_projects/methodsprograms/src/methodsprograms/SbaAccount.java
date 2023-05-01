package methodsprograms;

public class SbaAccount {
	private int accNumber;
	private String accName;
	private double accBal;
	
	public void display() {
		System.out.println(this.accNumber +" "+ this.accName +" "+ this.accBal);
	}
	public void setData(int accNumber,String accName,double accBal ) {
		this.accNumber=accNumber;
		this.accName=accName;
		this.accBal=accBal;
	
	if(accBal<0)
		accBal=accBal*-1;
		this.accBal=accBal;
		
	}


	public static void main(String[] args) {
		SbaAccount sba=new SbaAccount();
		sba.setData(1, "sri", 3000);
		//SbaAccount sba1=new SbaAccount();
		//sba.setData(2, "srilu", 2000);
		sba.display();
		//sba1.display();

	}

}
