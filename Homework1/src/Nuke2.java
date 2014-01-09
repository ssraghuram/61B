import java.io.*;

public class Nuke2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader mykeydb = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter something: ");
		String input = mykeydb.readLine();
		char[] ar = input.toCharArray();
		char[] newar = new char[ar.length-1];
		for (int i =0; i<= ar.length-1; i++){
			if (i==0) newar[i] = ar[i];
			else{
				if (i > 1)
					newar[i-1] = ar[i];					
			}				
		}
		System.out.println(String.valueOf(newar));
	}

}
