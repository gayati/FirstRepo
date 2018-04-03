package myfactorypatterns;

public class OperatingSystemFactory 
{

	public OS getInstance(String str)
	{
		if(str.equals("Open"))
		return new Android();
		else if (str.equals("Close"))
			return new IoS();
		else
			return new Windows();
	}
}
