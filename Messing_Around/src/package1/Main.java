package package1;
class Main {
	public static void main(String[] args) {
		String creditCardN = "1234567890";
		char lastDigit = creditCardN.charAt(creditCardN.length() - 1); //get last digit
		creditCardN = creditCardN.substring(0, creditCardN.length() -1); //drop last digit

		String reversCCN = "";
		
		System.out.println(creditCardN.length());

		for(int i = creditCardN.length() -1; i >= 0; i-- ) {
			reversCCN = reversCCN + creditCardN.charAt(i);
		}
		
		System.out.println(reversCCN);

		System.out.print(reversCCN );
		
	}
}