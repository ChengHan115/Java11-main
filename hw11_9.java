
package practice;

interface Math01{
	public void show();
	public void add(int a, int b);	//a+b
	public void sub(int a, int b); //a-b
	public void mul(int a, int b);	//a*b
	public void div(int a, int b);		//a/b
}
interface AdvancedMath
{
	public void mod(int a, int b);		//a%b
	public void fac(int a);				//a!
	public void pow(int a, int b);		//a^b
}

class Compute01 implements Math01,AdvancedMath
{
	public int ans;
	public void show() {
		System.out.println("ans="+ans);
	}
	public void add(int a ,int b) {
		ans=a+b;
	}
	public void sub(int a ,int b) {
		ans=a-b;
	}
	public void mul(int a ,int b) {
		ans=a*b;
	}
	public void div(int a ,int b) {
		ans=a/b;
	}
	public void mod(int a ,int b) {
		ans=a%b;
	}
	public void fac(int a) {
		ans=1;
		for (int i=1;i<=a;i++) {
			ans=ans*i;
		}
	}
	public void pow(int a ,int b) {
		ans=a^b;
	}
}
public class hw11_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute01 cmp=new Compute01();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14,5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}

}