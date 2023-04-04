package exception.compileTime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C/Users/CarlosP/OneDrive/Desktop/testFile");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		
		while((str = br.readLine()) != null) {
			System.out.println(br.readLine());
		}
		
		fr.close();
		br.close();

	}

}
