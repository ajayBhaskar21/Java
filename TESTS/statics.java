

class test {
	
	static int a;
}

class statics {
	

	public static void main(String[] args) {


		test o1 = new test();
		o1.a = 10;

		test o2 = new test();
		o2.a = 20;

		// key word is static so for every object same value of 'a' is given
		// that variable remains constant for every object created to the class, but it can be modified.

		System.out.println(o1.a); // 20
		System.out.println(o2.a); // 20


	}
}