public class WorkerOfCompany
							{
private String name;
private String position;
private String gender;
private String dateOfBirth;
private String education;
private String placeOfEducation;
private String adress; 
private String phoneNumber;
private String seniority;
private String englishLevel; //level of foreign language
private int salary;

public giveS(){} //give salary
public examine(){} // to do exams,
public giveB(){}//give bonus
public giveWT(){}// give a working tool
public instruct (){}

private clean(){} // clean workspace
private work(){} //perform a task
private drink(){} //drink tea
private getInstruction(){} //  be instructed
private coaching() // visit coaching
								}
								
class Boss extends WokerOfCompany {
private boolean mba; // MBA
private boolean driver; // personal driver
private int watch; // golden watch
private sign(){} // sign a document
private meet(){} // make meeting				  
									}
									
class Programmer extends WokerOfCompany {
private boolean linux; // linux skills
private boolean laptop; 
private boolean glasses;
private program(){}
private download(){}
										}
										
class Cleaner extends WokerOfCompany	{
private boolean mop; 
private boolean broom;
private boolean bucket;
private sweep(){}
private wash(){}
										}
										
class Journalist extends WokerOfCompany	{
private String voiceRecorder; //  voice recorder brand
private boolean isNotepad; // notepad
private String pen; // pen brand
private  call(){} // make phone call
public makeinterview(){} // make interview