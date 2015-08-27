package chap11;

public class SuperHero extends Hero {

	private boolean flying;

	private void fly(){
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land(){
		System.out.println("着地した！");
	}
	public void run(){
		System.out.println("撤退した");
	}
}
