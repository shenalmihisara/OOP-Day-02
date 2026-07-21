/*class Test{
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
}*/
/*class Date{
	private static int year;
	private static int month;
	private static int day;
	
	public void setDate(int year int month int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void 
}
class Demo{
	public static void main(String[] args){
		Date d1 = new Date();
		d1.setDate(2026,07,10);
		
		Date d1 = new Date();
		d1.setDate(1996,12,15);
		
		Date d1 = new Date();
		d1.setDate(2020,01,16);
		
		d1.printDate();
		d2.printDate();
	}
}*/

/*class Date{
	private static int year;
	private static int month;
	private static int day;
	
	public void setDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}*/
	/*public void printDate(){
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}*/
	/*public int getyear(){
		return year;
	}

}
class Demo{
	public static void main(String[] args){
		
		Date d1 = new Date();
		d1.setDate(2025,01,16);
		//d1.printDate();
		System.out.println(d1.getyear());
		//System.out.println(d1.month);
		//System.out.println(d1.day);
	}
}*/
/*class Account{
	int balance;
	
	Account(int balance){
		this.balance=balance;
	}
	
	public void displayBalance(){
		System.out.println("Balance : "+balance);
	}
}
class AccountController{
	public static void withdraw(int amount, Account c1){
		c1.balance-=amount;
	}
}
class Demo{
	public static void main(String args[]){
		Account c1=new Account(100000);
		c1.displayBalance();
		
		AccountController.withdraw(5000, c1);
		c1.displayBalance();
	}
}*/

class Box{
	int length;
	int width;
	int height;
	
	Box(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public void printVolume(){
		int volume;
		volume = length*width*height;
		System.out.println("Volume of the Box : " + volume);
	}
}
class Demo{
	public static void main(String[] args){
		//Box b1 = new Box(12,5,3);
		//b1.printVolume();
		
		Box[] br = new Box[5];
		//System.out.println(br[0] + "," + br[1] + "," + br[2] + "," + br[3] + "," + br[4]);
		
		br[0] = new Box(6,5,9);
		br[1] = new Box(1,2,3);
		br[2] = new Box(4,5,6);
		br[3] = new Box(7,8,9);
		br[4] = new Box(8,2,3);
		
		for(int i=0; i<br.length; i++){
			br[i].printVolume();
		}
	}
}
