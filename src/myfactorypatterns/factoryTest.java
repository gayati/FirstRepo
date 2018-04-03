package myfactorypatterns;

public class factoryTest {

	public static void main(String[] args)
	{
//      OS obj = new Android();
//		obj.specification();
//		
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj1 = osf.getInstance("Open");
        obj1.specification();
	}

}
