package exam07;

public class FriendTest {

	public static void main(String[] args) {
		Friend[] friend = new Friend[5];
		
		friend[0] = new Friend("최민수", "010-7307-8185", "ChoiMinSu14@yahoo.com");
		friend[1] = new Friend("김철수", "010-9568-2832", "KimChulSu7@naver.com");
		friend[2] = new Friend("박영희", "010-8599-3701", "ParkYoungHee79@daum.net");
		friend[3] = new Friend("박영희", "010-1957-1688", "ParkYoungHee2@gmail.com");
		friend[4] = new Friend("최민수", "010-1787-2605", "ChoiMinSu83@gmail.com");
		
		System.out.print("이름\t전화번호\t\t메일주소\n");
		System.out.println("-----------------------------------------------------------");
		for(int i = 0; i < friend.length; i++) {
			System.out.println(friend[i].getInfo());
		}
		
	}

}
