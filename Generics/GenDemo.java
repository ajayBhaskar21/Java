
class Gen<T> {
	T ob;
	Gen(T o) {
		ob = o;
	}

	T getob() {
		return ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}

}


class GenDemo {
	public static void main (String[] args) {
		// reference for Integers
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);

		iOb.showType();

	}
}




