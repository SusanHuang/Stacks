import java.util.Arrays;

public class stacks {
	
	private String[] stackArray;
	
	// Size of the Array
	private int stackSize;
	
	private int topOfStack = -1;
	
	theStack(int size) {
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray,  "-1");
	}
	
	public void push(String input) {
		if(topOfStack + 1 < stackSize) {
			topOfStack++;
			stackArray[topOfStack] = input;
			
		}
	}
	public static void main(String[] args) {
		
	}
}
