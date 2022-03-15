import java.util.Scanner;
class A{
	A(int num){
		int count = 0;
		int temp = num;
		if(num == 0 || num == 1){
			System.out.println(num + " is not a prime number.");
		}
		else{
			for(int i=2; i<=(num/2); i++){
				if(num%i == 0){
					count++;
					break;
				}
			}
		}
		if(count >= 1){
			System.out.println(num + " is not a prime number.");
		}
		else{
			System.out.print(num + " is a prime number.");
		}
	}
	A(String str){
		String rev = "";
		int length = str.length();
		for(int i=length-1; i>=0; i--){
			rev += str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println(str + " string is palindrome.");
		}
		else{
			System.out.println(str + " string is not palindrome.");
		}
	}
}
class Construct{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		A a1 = new A(n);

		
		 
		
	}
}
