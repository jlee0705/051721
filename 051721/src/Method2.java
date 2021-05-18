import java.util.Random;

public class Method2 {

	public static void main(String[] args) {
		int arr[] = lotto();
		
		System.out.println("----------------------------");
		System.out.println("�ζ� ���� ���α׷� v1.2");
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
			
			
			if (i==0) { // �迭�� ����ִ»���
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

