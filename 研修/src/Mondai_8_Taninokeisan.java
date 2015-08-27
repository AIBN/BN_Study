import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mondai_8_Taninokeisan {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String line = br.readLine();
		String[] array = line.split(" ");

		int n = Integer.parseInt(array[0]);
		String s = array[1];

		if (s.equals("km")){
			int x = n*1000*100*10;
			System.out.println(x);
		}else if(s.equals("m")){
			int x = n*100*10;
			System.out.println(x);
		}else {
			int x = n*10;
			System.out.println(x);
		}
	}
}