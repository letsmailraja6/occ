package eg2;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Business b=new Business();
		try {
			b.openFile("hello.txt");
			System.out.println("File reading successfull");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("File unable to find");
		}
	}

}
