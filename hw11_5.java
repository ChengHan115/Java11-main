package test;

interface Math01{
	public void show();
	public void add(int a, int b);	//a+b
	public void sub(int a, int b); //a-b
	public void mul(int a, int b);	//a*b
	public void div(int a, int b);		//a/b
}

class Compute01 implements Math01{
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
}
public class hw11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute01 cmp=new Compute01();
		cmp.mul(3, 5);
		cmp.show();
	}

}
