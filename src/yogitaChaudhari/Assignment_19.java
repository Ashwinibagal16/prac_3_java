package yogitaChaudhari;

public class Assignment_19 {

	int printFirstDiviNo(int startNo ,int EndNo) {
		
		for(int index=startNo; index<=EndNo; index++) {
			if(index%7==0) {
				return index ;
			}
		}
		return -1;
	}

	int printSecondDiviNo(int startNo ,int EndNo) {
		int count=0;
		for(int index=startNo; index<=EndNo; index++) {
			if(index%7==0) {
				count++;
				if(count==2) {
					return index;
				}
			}
			
		}
		return -1;
	}

	int printNthDiviNo(int startNo ,int EndNo ,int Nth) {
		int count=0;
		for(int index=startNo; index<=EndNo; index++) {
			if(index%7==0) {
				count++;
				if(count==Nth) {
					return index;
				}
			}
			
		}
		return -1;
	}

	int printlastDiviNo(int startNo ,int EndNo) {
		for(int index=EndNo; index>=startNo; index--) {
			if(index%7==0) {
				return index ;
			}
		}
		return -1;
	}

	int printSecondLastDiviNo(int startNo ,int EndNo) {
		int count=0;
		for(int index=EndNo; index>=startNo; index--) {
			if(index%7==0) {
				count++;
				if(count==2) {
					return index;
				}
			}
			
		}
		return -1;
	}

	int printLastNthDiviNo(int startNo ,int EndNo ,int Nth) {
		int count=0;
		for(int index=EndNo; index>=startNo; index--) {
			if(index%7==0) {
				count++;
				if(count==Nth) {
					return index;
				}
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		Assignment_19 assignment_19 =new Assignment_19();
		int ans = assignment_19.printFirstDiviNo(100, 1000);
		int ans1 = assignment_19.printSecondDiviNo(100, 1000);
		int ans2 =assignment_19.printNthDiviNo(100, 1000, 50);
		int ans3 =assignment_19.printlastDiviNo(100, 1000);
		int ans5 =assignment_19.printSecondLastDiviNo(100, 1000);
		int ans4 =assignment_19.printLastNthDiviNo(100, 1000, 95);
		System.out.println("First Divisible No:" +ans);
		System.out.println("Second Divisible No:" +ans1);
		System.out.println("Nth Divisible No:" +ans2);
		System.out.println("Last Divisible No:" +ans3);
		System.out.println("Second Last Divisible No:" +ans5);
		System.out.println("Last Nth Divisible No:" +ans4);
	}

}
