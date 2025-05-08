package yogeshGhuge;

public class Assignment_14 {
	//int count;
	void evenNum(int start, int end) {
		for(int num=start;num<15;num++) {
			if(num%2==0) {
				System.out.println(num);
				//count=count++;
			}
		}
		//System.out.println(count);
	}

	public static void main(String[] args) {
		Assignment_14 assign_14 = new Assignment_14();
		assign_14.evenNum(10, 15);
	}

}

/*Write only one program having the following methods.
print all even numbers in a range 10 to 15.
Hint : pass start and end index as a parameter.
*/
