package mayurKamble;

class EvenNumRange{

	void displayEvenNumber(int startIndex,int endIndex){
		if(startIndex<endIndex){
			System.out.println(" For Range "+startIndex+"-"+endIndex+" Even Numbers Are :");
			for(int i=startIndex;i<=endIndex;i++){
				if(i%2==0){
					System.out.println(i);
				}
			}
		}
	}
	
	public static void main(String[]args){
		EvenNumRange evenNumRange= new EvenNumRange();
		evenNumRange.displayEvenNumber(10,15);
	}
}