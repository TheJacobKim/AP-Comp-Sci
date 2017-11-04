
public class APExamCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean Bull1, Bull2, Bull3;
		
		String str1 = "greetings";
		String str2 = "greetings";
		String str3 = str1;
		
		Bull1 = str1==str2;
		Bull2 = str2==str3;
		Bull3 = str1==str3;
		System.out.print(Bull1+" "+Bull2+" "+Bull3);		
	}
}
