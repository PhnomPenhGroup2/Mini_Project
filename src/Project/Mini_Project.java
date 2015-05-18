package Project;

public class Mini_Project {
	public static void main(String[] args) {
		String str = "Hello World";
	      String anotherString = "hello world";
	      Object objStr = str;

	      System.out.println(str);
	      System.out.println(anotherString);
	      System.out.println(objStr);
	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));
	}
}
