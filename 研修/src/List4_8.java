public class List4_8{
	public static void main(String[] args){
		int[] score = {20,30,40,50,80};
		int sum = score[1] + score[2] + score[3] + score[4] + score[0];
		int avg = sum / score.length;
		System.out.println("���v�_�F" + sum);
		System.out.println("���ϓ_�F" + avg);
	}
}