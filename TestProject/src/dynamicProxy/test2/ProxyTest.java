package dynamicProxy.test2;

public class ProxyTest {

	public static void main(String[] args) {
		
		ISubject sub = new Subject();
		SubjectProxy proxyClass = new SubjectProxy();
		
		ISubject proxy = (ISubject)proxyClass.newInstance(sub);
		proxy.hello();
		proxy.rent();
	}

}
