package saurabhBelkhede;
//assignment 10
class MonthIndex{

	void indexvalue (int index){
		if (index >= 1 && index <= 3){
			if (index == 1)
				System.out.println("Month index " + index + " is in Q1, its Jan");
				else if (index == 2)
					System.out.println("Month index " + index + " is in Q1, its Feb");
				else if (index == 3)
					System.out.println("Month index " + index + " is in Q1, its Mar");
			}else if (index > 4 && index <= 6){
				if (index == 4)
					System.out.println("Month index " + index + " is in Q2, its Apr");
				else if (index == 5)
					System.out.println("Month index " + index + " is in Q2, its May");
				else if (index == 6)
					System.out.println("Month index " + index + " is in Q2, its Jun");
			}else if (index > 7 && index <= 9){
				if (index == 7)
					System.out.println("Month index " + index + " is in Q3, its Jul");
				else if (index == 8)
					System.out.println("Month index " + index + " is in Q3, its Aug");
				else if (index == 9)
					System.out.println("Month index " + index + " is in Q3, its Sept");
			}else if (index > 10 && index <= 12){
				if (index == 10)
					System.out.println("Month index " + index + " is in Q4, its Oct");
				else if (index == 11)
					System.out.println("Month index " + index + " is in Q4, its Nov");
				else if (index == 12)
					System.out.println("Month index " + index + " is in Q4, its Dec");
			}else{
				System.out.println("Month index " + index + " is invalid");
		}
	}
		
		public static void main(String[] args) {
			MonthIndex monin = new MonthIndex();
			monin.indexvalue(5);
			monin.indexvalue(1);
			monin.indexvalue(8);
			monin.indexvalue(11);
			monin.indexvalue(13);
		}
}