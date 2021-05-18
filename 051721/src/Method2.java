import java.util.Random;

public class Method2 {

	public static void main(String[] args) {
		int arr[] = lotto();
		
		System.out.println("----------------------------");
		System.out.println("로또 생성 프로그램 v1.2");
		System.out.println("----------------------------");
		for (int n : arr) {
			System.out.print(n + ", ");
		}
	}
	
	public static int[] lotto() {
		Random r = new Random();
		int[ ] lottoArr = new int[6];
		for (int i=0; i<lottoArr.length; i++) {
			int num = r.nextInt(45) + 1;
			
			
			if (i==0) { // 배열이 비어있는상태
				lottoArr[i] = num;
			}
			else {
				for (int j=0;  j<i;  j++) {
					if (num != lottoArr[j]) {
						lottoArr[i] = num;
					}
					else {
						i--;
						break;
					}
				}
			}
		}
		return lottoArr;
	}
	public static int fact (int n) {
		if (n<=1) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
}

