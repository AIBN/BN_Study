package chap11;

public class Main {
	public static void main(String[] args){
		Hero h = new Hero();
		h.run();
		SuperHero sh = new SuperHero();
		sh.run();
	}


}

//setterメソッド
public void setName(String name){this.name = name;}
public void setPrice(int price){this.price = price;}
public void setColor(String color){this.color = color;}
public void set
