package chap8Main;

public class Cleric {

	String name;
	int hp = 50;
	int mp = 10;
	static final int MAX_HP = 50;
	static final int MAX_MP = 10;


	public Cleric(String name,int hp,int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Cleric(String name,int hp){
//		this.name = name;
//		this.hp = hp;
		this(name,hp,MAX_MP);
//		this.mp = MAX_MP;
	}
	public Cleric(String name){
//		this.name = name;
//		this.hp = MAX_HP;
//		this.mp = MAX_MP;
		this(name,MAX_HP);
	}





	void selfAid(){
		this.mp -= 5;
		this.hp = MAX_HP;
	}
	 int pray(int sec){
		 int i = new java.util.Random().nextInt(3);
		 int a = sec + i;
		 int b = this.MAX_MP - this.mp;

		 int c = Math.min(b,a);


//		 int c = 0;
//		 if(a < b){
//			 c = a;
//		 }else{
//			 c = b;
//		 }
		 this.mp +=c;
		 return c;




	}

}
