package selfstudy.exec01.dss01;

public class AsciiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char chr = 'A'; //9=>57,65
		System.out.println(chr);
		System.out.println((int)chr);
		System.out.println((65-57));
		
		//int dec = 104;
		System.out.println(Integer.toBinaryString(104));
		System.out.println(Integer.valueOf("999999",10));
		System.out.println(Integer.valueOf("1111111111",8));
		System.out.println(Integer.valueOf("1111111111",5));
		System.out.println(Integer.valueOf("1111111111",2));
		System.out.println(Integer.valueOf("256",16));
		
		String number = "100";            

		try{

		    int bin = Integer.parseInt(number, 2);
		    int oct = Integer.parseInt(number, 8);
		    int dec = Integer.parseInt(number, 10);
		    int hex = Integer.parseInt(number, 16);                   
		    System.out.println("Default Value: " + number);
		    System.out.println("2진수로 봤을 때: " + bin);
		    System.out.println("8진수로 봤을 때: " + oct);
		    System.out.println("10진수로 봤을 때: " + dec);
		    System.out.println("16진수로 봤을 때: " + hex);        
		}
		catch (NumberFormatException e) {
		    System.out.println("Error: " + e);
		}
	}
}