package chap11;

import chap8Main.Matango;

public class Hero {

	private String name = "ミナト";
	private int hp = 100;

	private void attack(Matango m){
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ptのダメージを与えた！");
	}
	public void run(){
		System.out.println(this.name + "は逃げ出した！");
	}
}
