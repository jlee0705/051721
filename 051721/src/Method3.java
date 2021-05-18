import java.util.Random;

public class Method3 {

	public static void main(String[] args) {
		int sum = 0; //합을 만들어야함(총점을 위해서)
		int b = 0;
		int arr[][] = getScore();
		for (int [] i : arr) {
			for (int j : i) {
				System.out.print(j + "\t");
				sum += j;
				
			}
			String a = getHakjum(b);
			System.out.print("총점: " + sum);
			System.out.println( "  평균: " + (sum/3));
			System.out.println("학점 : " + getHakjum(sum/3));
			System.out.println();
			sum = 0;

		}

	}
	
	public static String getHakjum(int b) {
		if (b >= 90) {
			return "A";}
		else if (b<= 89 && b>= 80) {
			return "B";}
		else if (b <= 79 && b >= 70) {
			return "C";}
		else if (b <= 69 && b>= 60) {
			return "D";}
		else if (b<= 59 && b >= 50) {
			return "E";}
		else {
			return "F";}

	}
	
	public static int[][] getScore() {
		Random r = new Random();
		int[][] score = new int [5][3];
		int data[]= {10, 20, 30, 40, 50,60, 70, 80, 90, 100};
		
		for (int i=0; i<score.length; i++) {
			for (int j=0;j<score[i].length;j++) {
				score[i][j]= data[r.nextInt(10)];
//				System.out.print(score [i] [j] + "\t ");
			}
			System.out.println();
			
		}
		return score;
	}

}
