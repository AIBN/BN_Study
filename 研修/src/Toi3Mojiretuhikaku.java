import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Toi3Mojiretuhikaku {
	 public static void main(String[] args) throws IOException {
		 InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			//一行だけ読み込み
			String line = br.readLine();
			//何で区切るか
			String[] array = line.split(" ");

			String first = array[0];
			String second = array[1];

			if(first.equals(second)){
				System.out.println("True");
				}else{
					System.out.println("False");
			}


	 }

}
