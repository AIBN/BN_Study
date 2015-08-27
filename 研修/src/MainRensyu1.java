public class MainRensyu1{
	public static void main(String[] args){

//		int a = 3;
//		int b = 5;
//		int c = a*b;
//		System.out.println("縦3 横5の長方形の面積は" + c)


//		System.out.println("ようこそ占いの館へ");
//		System.out.println("キーボードにあなたの名前を入力してください");
//		String name = new java.util.Scanner(System.in).nextLine();
//		System.out.println("あなたの年齢を入力してください");
//		String Stringage = new java.util.Scanner(System.in).nextLine();
//		int age = Integer.parseInt(Stringage);
//		int fortune = new java.util.Random().nextInt(4);
//		fortune++;
//		System.out.println("占いの結果がでました");
//		System.out.println(age +"歳の" +name +"さん、あなたの運気番号は" + fortune +"です。");
//		System.out.println("1:大吉2:中吉3:吉4:凶");

//		int seibetsu = 1;
//		int age = 22;
//		System.out.println("こんにちわ");
//		if(seibetsu == 0){
//			System.out.println("私は男です。");
//			System.out.println( age +"歳です");
//		}else{
//			System.out.println("私は女です。");
//		}
//		System.out.println("よろしくお願いします。");

		System.out.println("[メニュー]1:検索2:登録3:削除4:変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected){
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}

	}
}