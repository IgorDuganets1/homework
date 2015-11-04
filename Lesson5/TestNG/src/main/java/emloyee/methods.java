package emloyee;

public class methods {

	public float calculateSalary(float baseRate, float experienceRatio, float bonus)
    {
        return baseRate + experienceRatio*bonus;
    }
	
	public float calculateTaxEmloyee(float calculateSalary, float taxRate)
	{	
		return calculateSalary*taxRate;
	}
	
	public String takeNameEmployee (String newFirstName, String newLastName, String newPosition)
	{
		String LastName = newLastName;
		String FirstName = newFirstName;
		String position = newPosition;
		return FirstName+" " +LastName+", "+position;
	}
	
	public String takeAdressEmployee ( String newStreet, String newHouse, String newAppartments)
	{
		String street=newStreet;
		String house=newHouse;
		String appartments=newAppartments;
		return street+", "+house+", "+appartments;
	}
	
	public String takeDateOfBirthEmloyee ( String newYear, String newMonth, String newDay)
	{
		String year=newYear;
		String month=newMonth;
		String day=newDay;
		return year+"-"+month+"-"+day;
		}
	
	public float calculateExperienceRatio (int yearPermit, int monthPermit, int yearToday, int monthToday, int ratioPosition)
	{ 	
		if (ratioPosition==0) throw new ArithmeticException();
		if (monthPermit<=monthToday){
		float res=(float)(yearToday-yearPermit)/ratioPosition; 
		return res;
									}
		else {
			float res2=(float)(yearToday-yearPermit-1)/10;
			return res2;}
	}
		
	public String getNameEmployee ()
	{
		final String FIRST_NAME="Jack";
		final String LAST_NAME="Bruce";
		final String POSITION="bassman";
		return FIRST_NAME + " " + LAST_NAME + ", " + POSITION;
	}
	
	public String getAdressEmployee ()
	{
		final String STREET="Baker street";
		final String HOUSE="12/2";
		final String APPARTMENTS="3";
		return STREET+", "+HOUSE+", "+ APPARTMENTS;
	}
	
	public String getDateOfBirthEmployee ()
	{
		final String YEAR="1943";
		final String MONTH="05";
		final String DAY="14";	
		return YEAR + "-" + MONTH + "-" + DAY;
	}
	
	public boolean isBirthdayBonus (int monthToday)
	{
		final int MONTH=05;
		if (monthToday!=MONTH){
			return false;}
		else 
			return true;
		
		}
			
}
