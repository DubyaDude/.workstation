import java.util.Scanner;
public class CalcTip {
	public static void main(String[] args) {
		double initBill, tip, total;
		System.out.print("Please enter the subtotal: ");
		Scanner input = new Scanner(System.in);
		initBill = input.nextDouble();
		if( initBill < 30.0 ){
			tip = 5.0; 
		}else{
			tip = initBill * .15;
		}
		total = initBill + tip;
		System.out.print("INIT:" + initBill + " The gratuity is $" + tip + " and the total bill is $" + total);
		System.out.print(15.69 + 5.0);
		
	} 
}