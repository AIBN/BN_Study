package chap11;

public class PoisonMatango extends Matango{
	private int MaxPoison = 5;

	public PoisonMatango(char suffix){
	supper(suffix);
	}

	public void attack(Hero h){
		supper.attack(h);
		System.out.println("通常ダメージ" + this.suffix + "の攻撃");
		if(MaxPoison > 0){
			System.out.println("さらに毒の胞子をばら撒いた！");
			int dmg = h.getHp /5;
			System.out.println(h.name +"に" + dmg + "ptのダメージ！" );
			this.MaxPoison--;

		}

	}
}
