public class Rensyu2_3{
	public static void main(String[] args){
	
	System.out.println("1");
	System.out.println("2");
	String name = new java.util.Scanner(System.in).nextLine();
	System.out.println("3");
	String ageString = new java.util.Scanner(System.in).nextLine();
	int age = Integer.parseInt(ageString);
	int fortune = new java.util.Random().nextInt(4);
	fortune++;
	System.out.println("4");
	System.out.println(age + "5" + name + "6" + fortune + "7");
	System.out.println("1: 1 2:2 3:3 4: 4");
	}


}