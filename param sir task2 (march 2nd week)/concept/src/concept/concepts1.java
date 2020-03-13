package concept;
 class concepts1 {
	public int i;
	public concepts1(int i) {
		this.i=1;
	}
	public static void main(String...ar) {
		concepts1 a1=new concepts1(334);
		concepts1 a2=a1;
		a2.i=998;
		System.out.println(a2.i+"\t"+a1.i);//...............?????
	}
}