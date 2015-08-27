import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Toi4Kazunohikaku {
	public static void main(String[] args) throws IOException {

	 // InputStreamReader のオブジェクトを生成
	    InputStreamReader isr = new InputStreamReader(System.in);
	    // BufferedReaderオブジェクトの生成
	    BufferedReader br = new BufferedReader(isr);
	    // 一行だけ読み込み
	    String line = br.readLine();
		//何で区切るか
		String[] array = line.split(" ");
	    // 数値型に変換
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);

		if(a < b){
			System.out.println(b);
		}else if(a > b){
			System.out.println(a);
		}else{
			System.out.println("eq");
		}
//		//if(a == b){
//		System.out.println("eq");
//		}else{
//			System.out.println(Math.max(a,b));
//		}こういうやり方もあるよ

	}
}
