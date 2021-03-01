package eg1;

public class DataType {

	public static void main(String[] args) {

		/*8 primtive data types and remember String is not a data type. String here in Java is class.
		 * DataType			size(byte/bytes)			default value
		 * ----------------------------------------------------------------
		 * byte					1							0
		 * short				2							0
		 * int					4							0  - java reads default as int
		 * long					8							0   -end it with L to make it long else it default takes it as int
		 * 
		 * float				4							0.00000f - end float values with f 
		 * double				8							0.00000d all decimal values are read as double by default
		 * 
		 * char					2							'\u0000' java supports UNI code charset where it covers close to 17country languages
		 * boolean				1							false
		 */
		
		int x=10;
		System.out.println("x = "+x);
		long l=12345678991L;
		System.out.println("l = "+l);
		
		float ratings=12.33f;
		System.out.println("ratings = "+ratings);
		
		double salary =2222.3333;
		System.out.println("salary : "+salary+" rating is "+ratings);
		
		char c='A';
		System.out.println(c);
		
		boolean b=false;
		System.out.println(b);
		

	}

}
