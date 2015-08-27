import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Toi1Tachizan {
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//一行だけ読み込み
		String line = br.readLine();
		//何で区切るか
		String[] array = line.split(" ");
		//数値に変換
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);

		//足し算
		int x = a + b;

		System.out.println(x);
	}

}
