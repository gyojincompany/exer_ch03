import java.util.Scanner;

public class ThreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		
		Scanner scann = new Scanner(System.in);
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("정수 10개 를 입력하시오:");
			arr[i] = scann.nextInt();
		}
		
		System.out.println("--------------3의 배수 -------------");
		
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i] % 3 == 0) {
				System.out.println(arr[i]);				
			}
		}
		
		scann.close();
		
	}

}
