package Chapter_12;

public class Chapter12_01 {

	public static void main(String[] args) {
		
		 if (args.length != 3) {
			 System.out.println("Usage: java Calculator operand1 operator operand2");
			 System.exit(0);
			 }
		 
		 int result = 0;
		 
		 try {
			 switch (args[1].charAt(0)) {
		 
			 case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			 break;
			 case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			 break;
			 case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			 break;
			 case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			 }
			
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);

		 }
		 catch (Exception e1) {
			 
			 System.out.println("Wrong input: " + e1.getMessage().substring(e1.getMessage().indexOf("\"") + 1, e1.getMessage().lastIndexOf("\"")));
		 }
		 
		 
	
	

	}
}
