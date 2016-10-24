package dynamicProxy;


public class TestDynamicProxy {

	public static void main(String[] args) {
		
		Subject realSubmect = new RealSubject();
		
		DynamicProxy proxy = new DynamicProxy();
		
		Subject subject = (Subject)proxy.newProxyInstance(realSubmect);
		
		subject.rent();
		subject.hello("cao ni ma!");
		
	}

}
