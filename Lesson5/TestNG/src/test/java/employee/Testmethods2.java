package employee;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testmethods2 {
	
	private static methods m;
	
	@BeforeClass (alwaysRun=true)
	public static void runM()
	{
		m = new methods();
	}
	
	@AfterClass (alwaysRun=true)
	public static void closeM()
	{
		m = null;
     }

	@Rule
	  public final ExpectedException exp = ExpectedException.none();
	
	
	@Test(groups={"Calculate"},timeOut=100)
	public void testCalculateSalary()
	{
		float res = m.calculateSalary(1000.0f, 0.5f, 500.0f);
		Assert.assertEquals(1250f, res, 0);
		}
	
		
	@Test(groups={"takeEmployee"},timeOut=100)
	public void testTakeAdressEmployee()
	{
		String adress = m.takeAdressEmployee("Baker street", "12/2", "3");
		Assert.assertEquals(adress, "Baker street, 12/2, 3");
	}
	
	@Test(groups={"takeEmployee"},timeOut=100)
	public void testTakeDateOfBirthEmloyee()
	{
		String date=m.takeDateOfBirthEmloyee("1943", "05", "14");
		Assert.assertEquals(date, "1943-05-14");
	}
	
	
	@Test (expectedExceptions = ArithmeticException.class,groups={"Calculate"},timeOut=100)
	public void testCalculateExperienceRatioException()
	{
		exp.expect(Exception.class);
		m.calculateExperienceRatio(2000, 3, 2009, 2, 0);
		
	}
	

	@Test(groups={"getEmployee"},timeOut=100)
	public void testGetNameEmployee()
	{
		String name = m.getNameEmployee();
		Assert.assertEquals(name, "Jack Bruce, bassman");
	}
	
	@Test(groups={"getEmployee"},timeOut=100)
	public void testGetAdressEmployee()
	{
		String adress = m.getAdressEmployee();
		Assert.assertEquals(adress, "Baker street, 12/2, 3");
	}
	
}
