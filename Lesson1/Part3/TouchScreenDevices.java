public class TouchScreenDevices
							{
private String form;
private String size;
private String OS;
private String slot; // Card slot
private String memory; // Internal Memory
private String cpu; // CPU
private String colour;
private String producer;
private String model;
private String country; //country of origin
 
public methods: 
public charge(){} // connect the power supply
public insert(){} // insert the card
public upgrade(){} // upgrade software
public makeP(){} // make photo
public turnWifi(){} // turn wi-fi

private methods: 
private findN(){} // find a network
private load(){} // load OS
private format card, install an application, save the photo
							}

class Smartphone extends TouchScreenDevices	{
private boolean isModule3g; // 3g module available
private boolean isFrontCamera; // front camera available
private int simNumber; // number of SIM cards 
private findGsm(){} // find GSM network
private chandgeSim(){} // chandge SIM card
											}


class Tablet extends TouchScreenDevices		{
private boolean isWifi; // wi-fi module available
private boolean camera; // camera available
private int cpuNumber // number of CPU
private findWifi(){} // find wi-fi network
private turnBluetooth(){} // turn on bluetooth
											}

class Atm extends TouchScreenDevices		{
private boolean isCardReader; // card reader available
private boolean pincode; // pin true
private boolean isCash; // cash available
private execute(){} // execute access
private giveCash(){} // give cash
											}

class Desk extends TouchScreenDevices		{
private int usersNumber; // number of users
private boolean speaker; // aud³o speaker available
private int hdnumber; // number of hard discs
private loadApplication(){} // load application
public organizeWorkFlow(){} // workflow organization
											}