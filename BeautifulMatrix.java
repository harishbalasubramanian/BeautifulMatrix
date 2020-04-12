import java.io.*;
import java.util.*;
public class BeautifulMatrix {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int y = 0;
		boolean breakingOut = false;
		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				int a = Integer.parseInt(st.nextToken());
				if(a == 1) {
					x = j+1;
					y = i+1;
					breakingOut = true;
					break;
				}
			}
			if(breakingOut) {
				break;
			}
		}
		System.out.println(Math.abs(x-3)+Math.abs(y-3));
	}
}
