import java.net.*;
import java.io.*;

/*
 * This is a test for git
 */
public class OpenCommercial {
	public static void main(String[] arg) throws Exception{
		BufferedReader mykeydb = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter something: ");
		String s  = "http://www."  + mykeydb.readLine() + ".com";
		URL myurl = new URL(s);
		InputStream ins = myurl.openStream();
		BufferedReader myurldata = new BufferedReader(new InputStreamReader(ins));
		String[] outArray = new String[5];
		for (int i =0; i <5; i++){
			outArray[i] = myurldata.readLine();
		}
		for (int i = outArray.length-1; i>=0; i--){
			System.out.println(outArray[i]);
		}
	}

}
