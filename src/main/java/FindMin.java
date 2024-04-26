
public class FindMin {
int min;
void minFun(int n1, int n2) {
	min =n1;
	if(min>n2)	
			min=n2;
	System.out.println("Od broevite "+n1+" i "+n2+" pomal e "+min);
}
void minFun(int n1, int n2, int n3) {
	min =n1;
	if(min>n2) min =n2;
	if(min>n3) min =n3;
	System.out.println("Od broevite "+n1+", "+n2+" i "+n3+" pomal e "+min);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMin najmal = new FindMin();
		najmal.minFun(11,6);
		najmal.minFun(6, 3, 4);
	}

}
