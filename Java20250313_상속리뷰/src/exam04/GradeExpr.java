package exam04;

public class GradeExpr {
	private int[] jumsu;
	//private int sum = 0;
	public GradeExpr() {
		
	}
	
	 //jumsu 배열을 멤버변수에 할당
    public GradeExpr(int[] jumsu) {
        this.jumsu = jumsu;
    }
    
    // 총점 계산
    public int getTotal() {
        int sum = 0;
        for (int i = 0; i < jumsu.length; i++) {// for문, score 배열 수 만큼 반복
        	sum += jumsu[i];  //score 배열 값 총합
        }
        return sum;
    }
    
    // 평균 계산
    public double getAverage() {
    	return (double)getTotal()/jumsu.length;
    }
    
    // 최고 점수 계산
    public int getGoodScore() {
        int max = jumsu[0];
        for (int i = 1; i < jumsu.length; i++) { // for문, score 배열 수 만큼 반복
            if (jumsu[i] > max) { //score[i] 값이 현재 max값보다 클경우 max값 변경
                max = jumsu[i];
            }
        }
        return max;
    }
    // 최저 점수 계산
    public int getBadScore() {
        int min = jumsu[0];
        for (int i = 1; i < jumsu.length; i++) { // for문, score 배열 수 만큼 반복
            if (jumsu[i] < min) {//score[i] 값이 현재 min값보다 작을경우 min값 변경
                min = jumsu[i];
            }
        }
        return min;
    }
}
