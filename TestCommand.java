import java.io.*;
class TestCommand
{
	
	public static void main(String[] args)throws Exception
	{
		Runtime rt=Runtime.getRuntime();
		rt.exec("cmd /c start cmd.exe /K \"cd c:/ && dir\"");
	}
}
