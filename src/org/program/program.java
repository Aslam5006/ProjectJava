package org.program;

public class program {

public static void main(String[] args) {

	int num=122;
	int n=num;
	int res=1,rem=1;
	while (num>0) {
		rem=num%10;
		res=res*rem;
		num=num/10;
	}
System.out.println(res);

}
}
