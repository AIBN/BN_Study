package chap13;

public class Hero {

	String name;
	int hp;
	static int money;


	static void setRandomMoney(){
	Hero.money = (int) (Math.random() *1000);


	}
	Sword sword;
	void attack(){
		System.out.println(this.name + "は攻撃した");
		System.out.println("敵に5ポイントのダメージを与えた。");
	}

	Hero(String name){
		this.hp = 100;
		this.name = name;
	}
	Hero(){
//		this.hp = 100;
		this("ダミー");
	}

	void run(){
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした。");
	}
	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}

	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

	void sleep(){
		this.hp =100;
		System.out.println(this.name + "は、眠って回復した！");

	}

}
