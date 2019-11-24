package miller_problem2;

public class Application {

	public static void main(String[] args){

	       SavingsAccount saver1,saver2;
	              saver1 = new SavingsAccount(2000.00);
	              saver2 = new SavingsAccount(3000.00);
	       SavingsAccount.modifyInterestRate(4.0);
	       System.out.println("            " + " Saver1" + "     Saver2");
	       for(int i=1; i<=12; ++i){
	           saver1.calculateMonthlyInterest();
	           saver2.calculateMonthlyInterest();
	           System.out.print("Month " + i + ": \t");
	           saver1.printBalance();
	           System.out.print("\t");
	           saver2.printBalance();
	           System.out.println();
	       }
	       System.out.print("\n");

	       System.out.println("New interest rate at 5.0%");
	       System.out.println();
	       SavingsAccount.modifyInterestRate(5.0);

	       saver1.calculateMonthlyInterest();
	       saver2.calculateMonthlyInterest();

	
	       System.out.print("Month 13: \t");
	       saver1.printBalance();
	       System.out.print("\t");
	       saver2.printBalance();
	       System.out.println();
	   }
	}

