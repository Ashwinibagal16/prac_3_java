package omkarBhujbal;

class Number{
	void processData(){
		 for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i + " is div by 5 and 7");
            }if (i % 5 == 0) {
                System.out.println(i + " is div by 5");
            } else if (i % 7 == 0) {
                System.out.println(i + " is div by 7");
            }
        }
	}	
	public static void main(String[] args){
		Number no = new Number();
		no.processData();
	
    }
}