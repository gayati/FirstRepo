package practice;



interface interf{
	
	void abstractfun(int x);
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //The lambda expression to implement fiunctional interface.
	//This interface by default call the method.
		interf i = (int x ) -> System.out.println(2*x);
		i.abstractfun(5);
	}

}
