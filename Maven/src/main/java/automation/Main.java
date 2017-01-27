package automation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] s) throws InterruptedException, IOException {
		Thread.sleep(4000);
		BufferedReader in = new BufferedReader(new FileReader("target//cucumber.json"));
		System.out.println("===>" + in.readLine());
		String str;
		while ((str = in.readLine()) != null)
			System.out.println(str);
		in.close();
		System.err.println("===========>AFter classsese");
	}
}
