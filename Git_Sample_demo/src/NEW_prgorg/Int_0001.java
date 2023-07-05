package NEW_prgorg;


interface Values{
	int a=10,b=20;
}
class Sample{
	int x=5,y=4;
}
class Demo extends Sample{
	void add() {
		int c=x+y+Values.a+Values.b;
		System.out.println(c);
	}
}
public class Int_0001 {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.add();
	}
}
