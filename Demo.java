class Test{
	int a;
	static int b;
	Test(){
		a=200;
		System.out.println("Test()");
	}
	static{
		b=100;
		System.out.println("Static block");
	}
	public void mInstance(){
		System.out.println("mInstance");
	}
	public static void mStatic(){
		System.out.println("mStatic");
	}
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
	}
}
