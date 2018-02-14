package lahvin_Assignment2;

import java.util.Scanner;

public class UsingStringElement_question3 {
	
	public static void threeA() {
		String[] wordArr = {"java","oracle","python","scala","hibernate"};
		
		for(int i=wordArr.length-1;i>=0;i--) {
			System.out.print(wordArr[i] + ", ");
		}
	}
	
	public static void threeB() {
		String word = "oracle";
		
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
	}
	
	public static void threeC() {
		String[] nameArr = {"java","hibernate","python","scala","hibernate"};
		
		for(int i=0;i<nameArr.length;i++) {
			for(int j=1;j<nameArr.length;j++) {
					if(nameArr[i] == (nameArr[j]) && i!=j) {
						nameArr[i] = ("0");
					}
				}
				if(!nameArr[i].equals("0")) {
					System.out.print(nameArr[i] + " ");
				}
			}
		}
	
	public static void threeD(int inputNum) {
		
		int lastNum = inputNum % 10;
		
		int midNum = (inputNum % 100)/10;
		
		int firstNum = inputNum/100;
		
		if(inputNum == ((Math.pow(firstNum, 3) + (Math.pow(midNum,3) + (Math.pow(lastNum, 3)))))){
			System.out.println("This is an Armstrong number.");
		}else {
			System.out.println("This is not an Amrstrong number.");
		}
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		//threeA();
		//threeB();
		//threeC();
		
		/*System.out.print("Enter your number: ");
		threeD(ss.nextInt());*/
	}
}
