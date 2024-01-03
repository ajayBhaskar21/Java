


class test {
	public int a;
}


class publics {

	public static void main(String[] args) {
		
		test o1 = new test();
		o1.a = 10;

		test o2 = new test();
		o2.a = 20;


		System.out.println(o1.a);// 10
		System.out.println(o2.a);// 20
		

	}
}