public class Rensyu3_6{
	public static void main(String[] args){
		System.out.println("�����ăQ�[��");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0;i<5;i++){
			System.out.println("0����9�̐�������͂��Ă�������");
			int unm = new java.util.Scanner(System.in).nextInt();
			if(ans == unm){
				System.out.println("������");
				break;
			}else{
				System.out.println("�Ⴂ�܂�");
			}
		}
		System.out.println("�Q�[�����I�����܂�");
	}
}