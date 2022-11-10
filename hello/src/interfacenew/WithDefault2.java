package interfacenew;

interface WithDefault2 {
	int get();
	
	default int getNext() {
		int value = get() + 10; // calling abstract method
		return value;
	}
}
