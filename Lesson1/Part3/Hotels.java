public class Hotels
					{
private String name;
private String address;
private int category;
private boolean isPool; // pool available
private boolean isBeach; // beach available
private int number; // number of rooms
private String catering;
private String accommodation; // accommodation system (ALL inclusive)
private int area; // land area or hotel's square
private String spa;
private boolean isWifi;
 
public arrive(){}
public departure(){}
public live(){}
public eat(){}
public swim(){}
 
private clean(){} //clean room
private cook(){} // cook breakfast
private repair(){}
private landscape(){} // landscaping of area
private wash(){} // wash clothes
						}
						
class Resort extends Hotels	{
private int restNumber; // restaurants number
private int poolsNumber; // pools number
private int barsNumber; // bars number
private drinkMojito(){} // drink mojito, 
public rest(){}
							}
							
class Kolyba extends Hotels	{
private boolean isFireplace;
private boolean isGoat;
private boolean isCheese;
private drinkMilk(){}
private chopWood(){}
							}
							
class Motel extends Hotels	{
private isParking;
private String road;
private isMarket;
public sleep(){}
private drinkCola(){}
							}
							
class Hostel extends Hotels	{
private int peopleNumber; // number of people in the room
private boolean isLuggage; // luggage storage
private boolean isWashingMachine;
private internetaccess(){}
private changeBook(){}
							}