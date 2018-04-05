package myproxydesignpattern;

public class Client {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("geeksforgeeks.org");
           // internet.connectTo("abc.com");
            internet.connectTo("abcds.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

	}

}
