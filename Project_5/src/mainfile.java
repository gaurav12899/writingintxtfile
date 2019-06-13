import javax.swing.JOptionPane;


public class mainfile {
	public static void main(String[] args) {
		String name= JOptionPane.showInputDialog("Enter the file name");
		Read test=new Read(name);
		test.Process();	
		System.out.println(test.printresult());
	}

}
