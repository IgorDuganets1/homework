public class MusicInstruments
							{
private String manufacturer;
private String model;
private String country; //country of origin 
private int price; 
private boolean acoustic;
private String type; //wind, string, keyboard
private boolean electronic;
private String dataInterface; // interface
private int weight;
private String color;

public customize(){}
public play(){}
public connect(){}
public install(){}
public transport(){}
public repair(){}

private pitch(){} // hold pitch
private sound(){} 
private transmit(){} // transmit the signal
private enjoy(){} // pleasing the user
								}
								
class Guitar extends MusicInstruments	{
private String body;
private String wood;
private String pickup;
private changeString(){} // chandge string
private selectTone(){} // select tone
										}
										
class Drum extends MusicInstruments	{
private int plates; // number of plates,
private String pedal; // pedal model
private String plastic; // plastic producer
public tunePlastic(){} // tune plastic,
public installHihat(){} // install hi-hat
									}
									
class Piano extends MusicInstruments	{
private int octave; // number of octaves
private String keyMaterial; // material of keys
private boolean isConcert; // for concert or home use
public openCover(){} //open cover
public pushKey(){} // push key
										}

class Harp extends MusicInstruments	{
private String harmony;
private String tone;
private String coverMaterial; // material of cover 
public blow(){} // blow into
public pitch(){} // pitch sound
									}
										

