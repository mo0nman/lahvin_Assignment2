package lahvin_Assignment2;

public class UsingForLoop_question1 {
	
	public static void printOne() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println("*");
		}
	}
	
	public static void printTwo() {
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j +" ");
			}
			System.out.println("");
		}
	}
	
	public static void printThree() {
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("x ");
			}
			System.out.println("");
		}
	}
	
	public static void printFour() {
		for(int i=1;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
	
	public static void printFive() {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
	}
	
	public static void printSix() {
		for(int i=1;i<6;i++) {
			int j;
			for(j=1;j<i;j++) {
				System.out.print(j + " ");
			}
			
			for(int k=j;k>0;k--) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		
		//printOne();
		//printTwo();
		//printThree(); 
		//printFour();
		//printFive();
		//printSix(); 
		
		
	}

}
