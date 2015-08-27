
public class Wond {
	private String name;
	private double power;

	public String getName(){
		return this.name;
	}
	public void setHeal(String name){

		if(name == null ||name.length() <3){
			throw new IllegalArgumentException
			("名前がnullである。処理を中断");
		}
		this.name = name;
	}
	public double getPower(){
		return this.power;
	}
	public void setHeal(double power){
		if(power < 0.5 || power > 100.0){
			throw new IllegalArgumentException
			("");
			this.power = power;
		}
	}

}
