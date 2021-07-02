
public class DisplayingArrays {

	
		  public static void main(String[] args) {
		    int[] intArray = new int[3];
		    intArray[0] = -5123;
		    intArray[2] = 32;

		    System.out.println(intArray[0]); //-5123
		    System.out.println(intArray[1]); //0 (nothing there) - not declared
		    System.out.println(intArray[2]); //32
		    System.out.println(intArray[3]); //outside of range - error
		  }
		
}
