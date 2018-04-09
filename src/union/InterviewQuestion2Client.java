package union;


public class InterviewQuestion2Client {

	private static InterviewQuestion2 iQ2 = new InterviewQuestion2(7);
	
	public static void main(String[] args) {
		iQ2.union(0, 1);
		iQ2.union(1, 2);
		iQ2.union(3, 4);
		iQ2.union(5, 6);
		iQ2.union(4, 6);
		iQ2.populateElements();
		System.out.println(iQ2.find(6));
	}

}
