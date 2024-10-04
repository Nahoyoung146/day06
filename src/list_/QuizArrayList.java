package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> tel = new ArrayList<String>();
		String inputname, inputtel;
		int i = 0;
		while (true) {
			System.out.println("1. 연락처 등록\n2. 이름 검색\n3. 연락처 삭제\n4. 모든 연락처 보기\n5. 종료");
			System.out.print("메뉴 입력 : ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("이름 입력 : ");
				inputname = sc.next();
				System.out.print("전화번호 입력 : ");
				inputtel = sc.next();
				name.add(inputname);
				if (tel.contains(inputtel))
					System.out.println("이미 존재하는 연락처입니다.");
				else {
					tel.add(inputtel);
					System.out.println("연락처 등록 완료!!!\n축하합니다.");
				}
			} else if (num == 2) {
				System.out.print("검색할 이름 입력 : ");
				inputname = sc.next();
				if (name.contains(inputname)) {
					for (i = 0; i < name.size(); i++) {
						if (name.get(i).equals(inputname)) {
							System.out.println("이름 : " + name.get(i) + ", 전화번호 : " + tel.get(i));
						}
					}
				} else
					System.out.println("등록되어 있는 회원이 아닙니다.");

			} else if (num == 3) {
				System.out.print("삭제할 연락처 입력 : ");
				inputtel = sc.next();
				if (tel.contains(inputtel)) {
					name.remove(tel.indexOf(inputtel));
					tel.remove(tel.indexOf(inputtel));
					System.out.println("삭제 완료");
				}

				else
					System.out.println("등록되어 있는 회원이 아닙니다.");

			} else if (num == 4) {
				for (i = 0; i < tel.size(); i++) {
					System.out.println("이름 : " + name.get(i) + ", 연락처 : " + tel.get(i));
				}

			} else if (num == 5) {
				System.out.println("프로그램 종료");
				break;
			}

			else
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}
}
