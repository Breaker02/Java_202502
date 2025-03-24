package ex09;

public class daf {

	public static void main(String[] args) {
		String str = "koreakorea";
		
		System.out.println(str.indexOf('r'));
		System.out.println(str.lastIndexOf('r'));
		
		String board = "번호,제목,내용,설명";
		String[] board1 = board.split(",");
		System.out.println(board1[0]);
		System.out.println(board1[1]);
		System.out.println(board1[2]);
		System.out.println(board1[3]);
		
		String[] str1 = new String[3];
		str1[0] = "java";
		str1[1] = "java";
		str1[2] = "java";
		
		str1[0] = "String";
		
		for(String x : str1) {
			System.out.print(x + " ");
		}
	}

}
