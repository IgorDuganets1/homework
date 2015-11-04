package employee;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.testng.annotations.Test;

public class Testmethods {
			
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
	    public Timeout time = Timeout.millis(100); 
		
		@Rule
		  public final ExpectedException exp = ExpectedException.none();
		
		
		@Test(groups={"takeEmployee"})
		public void testTakeNameEmployee()
		{
			String name = m.takeNameEmployee("Jack", "Bruce", "bassman");
			Assert.assertEquals(name, "Jack Bruce, bassman");
			}
		
			
		@Test (groups={"Calculate"})
		public void testCalculateExperienceRatio()
		{
			float res=m.calculateExperienceRatio(2000, 3, 2009, 2, 10);
			Assert.assertEquals(0.8, res, 0.01);
			}
		
			
		@Test(groups={"getEmployee"})
		public void testGetDateOfBirthEmployee()
		{
			String date=m.getDateOfBirthEmployee();
			Assert.assertEquals(date, "1943-05-14");
		}
		
		@Test(dependsOnGroups={"Calculate"})
		public void testIsBirthdayBonus()
		{
			boolean res=m.isBirthdayBonus(5);
			Assert.assertEquals(true, res);
		}
		
		@Test(dependsOnMethods={"testCalculateExperienceRatio"})
		public void testCalculateTaxEmloyee()
		{
			float res = m.calculateTaxEmloyee(1000f, 0.2f);
			Assert.assertEquals(200f, res, 0);
			}
	}
