@FunctionalInterface
public interface Example3 {

void method2();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}
}
