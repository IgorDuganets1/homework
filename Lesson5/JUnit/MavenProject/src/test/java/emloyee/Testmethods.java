package emloyee;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import junit.framework.Assert;

public class Testmethods {
	
	private static methods m;
	
	@BeforeClass
	public static void runM()
	{
		m = new methods();
	}
	
	@AfterClass
	public static void closeM()
	{
		m = null;
     }

	@Rule
    public Timeout time = Timeout.seconds(1); 
	
	@Rule
	  public final ExpectedException exp = ExpectedException.none();
	
	@Test
	public void testCalculateSalary()
	{
		float res = m.calculateSalary(1000.0f, 0.5f, 500.0f);
		Assert.assertEquals(1250f, res, 0);
		}
	
	@Test
	public void testCalculateTaxEmloyee()
	{
		float res = m.calculateTaxEmloyee(1000f, 0.2f);
		Assert.assertEquals(200f, res, 0);
		}
	
	@Test
	public void testTakeNameEmployee()
	{
		String name = m.takeNameEmployee("Jack", "Bruce", "bassman");
		Assert.assertEquals(name, "Jack Bruce, bassman");
		}
	
	@Test
	public void testAdressEmployee()
	{
		String adress = m.takeAdressEmployee("Baker street", "12/2", "3");
		Assert.assertEquals(adress, "Baker street, 12/2, 3");
	}
	
	@Test
	public void testTakeDateOfBirthEmloyee()
	{
		String date=m.takeDateOfBirthEmloyee("1943", "05", "14");
		Assert.assertEquals(date, "1943-05-14");
	}
	
	@Test
	public void testCalculateExperienceRatio()
	{
		float res=m.calculateExperienceRatio(2000, 3, 2009, 2, 10);
		Assert.assertEquals(0.8, res, 0.01);
		}
	
	@Test //(expected=Exception.class)
	public void testCalculateExperienceRatioException()
	{
		exp.expect(Exception.class);
		m.calculateExperienceRatio(2000, 3, 2009, 2, 0);
	}
	

	@Test
	public void testGetNameEmployee()
	{
		String name = m.getNameEmployee();
		Assert.assertEquals(name, "Jack Bruce, bassman");
	}
	
	@Test
	public void testGetAdressEmployee()
	{
		String adress = m.getAdressEmployee();
		Assert.assertEquals(adress, "Baker street, 12/2, 3");
	}
	
	@Test
	public void testGetDateOfBirthEmployee()
	{
		String date=m.getDateOfBirthEmployee();
		Assert.assertEquals(date, "1943-05-14");
	}
	
	@Test
	public void testIsBirthdayBonus()
	{
		boolean res=m.isBirthdayBonus(5);
		Assert.assertEquals(true, res);
	}
}
	
	
