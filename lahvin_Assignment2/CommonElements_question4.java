package lahvin_Assignment2;

public class CommonElements_question4 {

	public static void main(String[] args) {
		
		int[] x = {4,7,3,9,2};
		int[] y = {3,2,12,9,40,32,4};
		
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<y.length;j++) {		//runs entire loop for one iteration of loop i
					if(x[i] == y[j]) {				
						System.out.print(x[i] + " ");
					}
				}
			}
		}
}
