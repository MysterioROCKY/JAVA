public class StringBufferManipulation {
	public static void main(String[] args) {
        	StringBuffer stringBuffer = new StringBuffer("Hello Sanyam, Welcome in my World");

		stringBuffer.reverse() ; 
		System.out.println("Reversed StringBuffer: " + stringBuffer) ;

		stringBuffer.replace (6, 13, "Agrawal") ;
		System.out.println("Modified StringBuffer: " + stringBuffer) ;
	}
}