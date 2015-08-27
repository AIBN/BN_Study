package chap13;

public class Wizard {
	String name;
	int hp;
	void hearl(Hero h){
		h.hp += 10;
		System.out.println(h.name + "のhpは");

	}

}
