public class Rensyu3_6{
	public static void main(String[] args){
		System.out.println("”‚ ‚ÄƒQ[ƒ€");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0;i<5;i++){
			System.out.println("0‚©‚ç9‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
			int unm = new java.util.Scanner(System.in).nextInt();
			if(ans == unm){
				System.out.println("“–‚½‚è");
				break;
			}else{
				System.out.println("ˆá‚¢‚Ü‚·");
			}
		}
		System.out.println("ƒQ[ƒ€‚ğI—¹‚µ‚Ü‚·");
	}
}