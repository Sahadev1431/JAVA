import java.io.*;

class ReadLines1{
	public static void main(String args[])
		throws IOException
		{// create a BufferedReader using System.in
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			String str;
				
			System.out.println("Enter lines of text.");
			System.out.println("Enter ‘stop’ to quit.");
				str="a";
				while  ((!str.equals ("stop")) || (!str.equals ("STOP"))) { 
					str = br.readLine() ; // Use readLine() froni BuffereciReoder to read a line of text 
					System.out.println(str); 
			} 
		}
}