@FunctionalInterface
public interface Example02 {
	
	void method1(String str);
	
	//Default Method
	default void log(String str) {
		System.out.println("I1v Logging: "+str);
	}
	//Static method
	static void print(String str) {
		System.out.println("Printing: "+str);
	}
	//trying to override Object method gives compile-time error as
		//"A default method cannot override a method from java.lang.Object"
	
//	default String toString() {
//		return "i1";
//	}
	
}
