package String;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s2 = "<img";
		String s1 = "11<img22<img333<img44<img55<img1";
		int count = countStr(s1,s2);
		System.out.println(count);
	}

	public static int countStr(String str1, String str2) {   
        int counter=0;  
        if (str1.indexOf(str2) == -1) {    
            return 0;  
        }   
            while(str1.indexOf(str2)!=-1){  
                counter++;  
                str1=str1.substring(str1.indexOf(str2)+str2.length());  
            }  
            return counter;    
    }
}
