package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
//			System.out.println(i + ".번째 입력");
//			String n = input.next();
			arr.add(input.next());
		}
		System.out.println(arr);
		System.out.println("찾을 값 입력");
		String search = input.next();
		System.out.println("contains : " + arr.contains(search));
		System.out.println("indexof : " + arr.indexOf(search));

//		[라면, 김밥, 떡볶이]
//		김밥 있는지?
//		김밥 삭제(remove) 후 add 순대 추가
//		[라면, 떡볶이, 순대]

		System.out.println("변경할 위치 입력");
		int index = input.nextInt();
		System.out.println("변경 데이터 입력");
		String data = input.next();
		
		arr.set(index, data);
		System.out.println(arr);
	}
}