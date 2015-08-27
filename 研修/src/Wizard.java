
public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wond wond;
	public void heal(Hero h){
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wondpower);
		h.setHp(h.getHp() + recovPoint);
		System.out.println
		(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		this.hp = hp;
	}
	public int GetMp(){
		return this.mp;
	}
	public void setMp(int mp){
		this.mp = mp;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Wond getWond(){
		return this.wond;
	}
	public void setWond(Wond wond){
		this.wond = wond;
	}
	}

}