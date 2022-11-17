package interfacenew;

interface WithDefault1 {
	int COUNT = 100;
	void test();
	default void show() {
		System.out.println("I am show -- default");
	}
}
