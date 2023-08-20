//
public class Example2 implements Example02,Example3{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(String str) {
		System.out.println("Example2 logging: "+str);
		Example02.print("Nisha");
	}

}
