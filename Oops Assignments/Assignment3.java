package assignments2;


class Account{
	
	void totalCash(int cash)
	{
		System.out.println("Total Cash: "+cash);
	}
	
}

class SavingAccount1 extends Account{
	double bal;
    double fd;
    public SavingsAccount(double bal,double fd){
        this.bal=bal;
        this.fd=fd;
    }
    public void disp(){
        System.out.println("Total money in saving:"+(bal+fd));
    }
    public double get(){
        return bal+fd;
    }
	
	
}

class CurrentAccount1 extends Account{
	
	void cashCredit(int credit)
	{
		System.out.println("Total Credit: "+(credit));
	}
	
}


public class Assignment3 {

	public static void main(String[] args) {
		
	}

}
