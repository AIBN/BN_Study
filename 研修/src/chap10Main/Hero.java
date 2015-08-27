package chap10Main;

import chap13.Sword;
import chap8Main.Matango;

public class Hero {
	private int hp;
	private String name;
	Sword sword;
	static int money;

	private String Name(){
		public void setName(String name) {
			if(name == null){
				throw new IllegalArgumentException
				("名前がnullである。処理を中断。");
			}
			if(name.length() <= 1){
				throw new IllegalArgumentException
				("名前が短すぎる。処理を中断。");
			}
			if(name.length() >= 8){
				throw new IllegalArgumentException
				("名前が長すぎる。処理を中断。");
			}
			this.name = name;
		}

	}

	void bye(){
		System.out.println("勇者は別れを告げた");
	}
	private void die(){
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです");
	}
	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は眠ってしまった。");
	}
	private void attack(Matango m){
		System.out.println(this.name + "の攻撃");


		System.out.println("おばけキノコ" + m.suffix + "から2ptの反撃を受けた");
		this.hp -= 2;
		if(this.hp <= 0){
			this.dai();
		}
	}
}
