package TestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersinterface implements ITestListener{

	public void onStart(ITestContext arg)
	{
		System.out.println("Starts Tests excecution....."+arg.getName());
	}
	
	
	   //This belogns to ITestListener and will exceute after starting of testset/batch

       public void onFinish(ITestContext arg)
     {
	    System.out.println("Finish Tests Excecution....."+arg.getName());
     
     }
       
	   //This belogns to ITestListener and will exceute before the main test method start l.e @Test
       
       public void onTestStart(ITestResult result)
       {
   	    System.out.println("passed Test....."+result.getName());

       }
       
       
       public void OnTestFailure(ITestResult result)
       {
    	   System.out.println("Failed Test..."+result.getName());
    	   
       }
       

     public void onTestSkipped(ITestResult result)
   {
	   System.out.println("Skipped Test..."+result.getName());
   }

}
