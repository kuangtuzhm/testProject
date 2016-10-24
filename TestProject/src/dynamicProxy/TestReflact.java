package dynamicProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflact {

	public static void main(String[] args) {


		Subject realSubject = new RealSubject();
		
		try {
			Class classType = Class.forName("dynamicProxy.RealSubject");
			System.out.println(classType.getName());
			
			Method methods[] = classType.getDeclaredMethods();
			
			for(Method method:methods)
			{
				System.out.println("Method========="+method+":"+method.getName());
			}
			
			Field fields[] = classType.getFields();
			for(Field field:fields)
			{
				System.out.println("Field========"+field+":"+field.getName());
			}
			
			Constructor constructors[] = classType.getConstructors();
			for(Constructor constructor:constructors)
			{
				System.out.println("Constructor======="+constructor+":"+constructor.getName());
				System.out.println(constructor.toString());
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
