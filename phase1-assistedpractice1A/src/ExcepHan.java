public class ExcepHan {
	public static void main(String[] args) {
		
			try{
				System.out.println(5/0);
				
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			System.out.println("Hello World");
	}


}