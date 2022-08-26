package JO187;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringBuffer text = new StringBuffer(line);
		while (true) {
			String num = br.readLine();
			if (text.length() < Integer.parseInt(num)) {
				text = text.deleteCharAt(text.length() - 1);
				System.out.println(text);
			} else {
				text = text.deleteCharAt(Integer.parseInt(num) - 1);
				System.out.println(text);
			}
			if (text.length() == 1) {
				break;
			}
		}
	}

}
