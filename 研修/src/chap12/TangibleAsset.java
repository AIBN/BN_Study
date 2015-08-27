package chap12;

public abstract class TangibleAsset extends Asset {
	private String color;
	public TangibleAsset(String name, int price, String color){
		super(name,price);
		this.color = color;
	}
	//getterメソッド
	public String getColor(){return this.color;}
}
