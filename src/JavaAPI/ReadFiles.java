package JavaAPI;
//Importing the needed API
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {

	public static void main(String[] args) {
		String path = "G:\\windows_notices.txt";
		
		FileReader fr = null ;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException msg) {
			System.out.println("The specified file ("+path+") not find");
			//In case of exception don't show my own error message 
			//msg.printStackTrace();			
		}		
		br = new BufferedReader(fr);
		String text = "";
		try {
			while((text = br.readLine())!=null){
				
				System.out.println(text);
			}
		} catch (IOException msg) {
			System.out.println("The specified file ("+path+") not find");
		}		
		finally{
			
		try {
			if((! path.isEmpty())&&(fr != null)){
			fr.close();
			}
		} catch (IOException msg) {
			System.out.println("The specified file ("+path+") not exist");
		}		
		try {
		if(br!=null){
				br.close();
		}
			} catch (IOException msg) {
				System.out.println("The specified file ("+path+") not exist");
			}
		}//end of finally */

	}

}
