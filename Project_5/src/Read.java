import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
private String arr[]= new String[50];
private int count=0;
private String result="";
public Read(String filename)
{
	try 
		{
		Scanner scFile = new Scanner(new File(filename));
		while(scFile.hasNext()) 
		{
			arr[count]=scFile.nextLine();
			count++;
		}
		scFile.close();
		
	}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		
		}
	
}

public void Process() {
	for(int i=0;i<count;i++) {
		Scanner scLine= new Scanner(arr[i]);
		result= result+scLine.next().charAt(0)+". "+scLine.next().charAt(0)+". "+scLine.next()+ " "+ scLine.next()+" "+scLine.next().charAt(0)+"\n";
		scLine.close();	
	}
	
	}

public String printresult() {
	return result;

}













}
