package chap9;

public class Main {
	public static void main(String[] args){

		Hero h = new Hero();
		System.out.println(h.hp);


//		String A = new String("こんにちは");
//		System.out.println(A);
//		Hero h = new Hero("ミナト");
//		System.out.println(h.hp);
//		System.out.println(h.name);

		Sword s = new Sword();
		s.name= "炎の剣";
		s.damage = 10;
//	//	Hero h = new Hero(String name);
//		h.name = "ミナト";
//		h.hp = 100;
//		h.sword = s;
//		System.out.println("現在の武器は" + h.sword.name);
//
		Hero h1;
		h1 = new Hero();
//		h1.name = "ミナト";
//		h1.hp = 100;

		System.out.println(h1.name);
		Hero h2 = new Hero();
		Hero.money = 100;
		System.out.println(Hero.money);
		System.out.println(h1.money);
		h1.money = 300;
		System.out.println(h2.money);
		//
//		Hero h2;
//		h2 = new Hero();
//		h2.name = "あさか";
//		h2.hp = 100;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
//
//		w.hearl(h1);
//		w.hearl(h2);
//		w.hearl(h2);

	}

}
