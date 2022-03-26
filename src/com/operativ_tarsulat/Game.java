package com.operativ_tarsulat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Game class that represents the whole game. Stores virologists and fields and controls the flow of gameplay
 *
 */
public class Game implements Serializable {
	/**
     * Maximum number of free fields generated per map
     */
	private final int MAX_FREE_FIELDS = 6; 
	/**
     * Minimum number of free fields generated per map
     */
	private final int MIN_FREE_FIELDS = 0;
		
	/**
     * Maximum number of neighbours a field can have
     */
    private final int MAX_ROADS = 5; 
    
    /**
     * Minimum number of shelters generated per map
     */
    private final int MIN_SHELTERS = 4;
    /**
     * Maximum number of shelters generated per map
     */
    private final int MAX_SHELTERS = 6;
    
    /**
     * Minimum number of warehouses generated per map
     */
    private final int MIN_WAREHOUSES = 4;
    /**
     * Maximum number of warehouses generated per map
     */
    private final int MAX_WAREHOUSES = 6;
    
    /**
     * Minimum number of amonis generated per warehouse
     */
    private final int MIN_AMINO_PER_WAREHOUSE = 10;
    /**
     * Maximum number of aminos generated per warehouse
     */
    private final int MAX_AMINO_PER_WAREHOUSE = 100;
    
    /**
     * Minimum number of nucleos generated per warehouse
     */
    private final int MIN_NUCLEO_PER_WAREHOUSE = 10;
    /**
     * Maximum number of nucleos generated per warehouse
     */
    private final int MAX_NUCLEO_PER_WAREHOUSE = 100;
    
    /**
     * Random object used for randomized decisions
     */
    private Random r;
	
	
	/**
	 * Virologists that are on the field 
	 */
	private List<Virologist> virologists;
	
    /**
     * Fields that make up the map
     */
    private List<Field> fields;
    
    
    /**
     * Currently playing virologist's index 
     */
    private int currentVirologistIndex = 0;
    
    /**
     * stores the name of the file the game can be saved to
     */
    private String saveFile;
    
    
    
    private static Game instance;
    
    /**
     * Singleton implementation
     * @return the strored instance of the class, creates a new one if there isn't one yet
     */
    public static Game GetInstance() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	if(instance == null)
    		instance = new Game();
    	Skeleton.LogReturn(instance.getClass().getName());
    	return instance;
    }
    
    /**
     * Constructor with no arguments, initializes all attributes
     */
    public Game() {
    	Skeleton.LogFunctionCall("Game ctr");
    	virologists = new ArrayList<>();
    	fields = new ArrayList<>();
    	Skeleton.LogReturn();
    }
    
    /**
     * For testing purposes, so the test can be rerun
     * Creates a new game
     */
    public static void Clear() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	instance = new Game(); // Creates a new instance of the game class discarding the last one
    	Skeleton.LogReturn();
    }
    /**
     * Returns a random int between the given bounds
     * @param min Minimum number, inclusive
     * @param max Maximum number, exclusive
     * @return Random number between min and max
     */
    private int RandomInt(int min,int max) {
    	int mod = max-min;
    	return (r.nextInt()%(max-min))+min;
    }

    /**
     * For testing purposes, adds a virologist to the list
     * @param v Virologist to be added
     */
    public void AddVirologist(Virologist v) {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),v.getClass().getName());
    	virologists.add(v);
    	Skeleton.LogReturn();
    }
    
    
    /**
     * Starts a new game by generating a new map with the given seeds
     * @param saveFile Name of the game, will be saved to a file called this
     * @param seed Seed for random number generation
     * @param names Names of the virologists
     */
    public void StartGame(String saveFile, Integer seed, String[] names) {
    	String namesArgAsString = "Array: ";
    	for(String name : names)
    		namesArgAsString+=name;
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),saveFile,seed.toString(),namesArgAsString);
    	this.saveFile = saveFile; // store save file name for future saves
    	r = new Random(seed); // Random for world generation 
    	
    	// Cleanup
    	virologists.clear();
    	fields.clear();
    	
    	for(String name : names)
    		virologists.add(new Virologist(name)); 
    	
    	List<Field> createdFields = new LinkedList<Field>();
    	
    	// Create 4 laboratories
    	createdFields.add(new Laboratory(new ProtectionGeneticCode()));
    	createdFields.add(new Laboratory(new AmnesiaGeneticCode()));
    	createdFields.add(new Laboratory(new ParalyzeGeneticCode()));
    	createdFields.add(new Laboratory(new DanceGeneticCode()));
    	
    	int warehouseCount = RandomInt(MIN_WAREHOUSES,MAX_WAREHOUSES+1); // count of warehouses to be generated
    	int shelterCount = RandomInt(MIN_SHELTERS,MAX_SHELTERS+1); // count of shelters to be generated
    	
    	int minCityCount = warehouseCount>shelterCount?warehouseCount:shelterCount; // minimum count of cities is the maximum count of same type of building
    	int maxCityCount = warehouseCount+shelterCount;
    	
    	int cityCount =  RandomInt(minCityCount,maxCityCount+1); //Number of cities to be generated
    	
    	List<Warehouse> warehouses = new LinkedList<Warehouse>();
    	List<Shelter> shelters = new LinkedList<Shelter>();
    	
    	// Create warehouses
    	for(int i = 0;i<warehouseCount;i++) {
    		int nucleo = RandomInt(MIN_NUCLEO_PER_WAREHOUSE,MAX_NUCLEO_PER_WAREHOUSE); // nucleo amount to be created
    		int amino = RandomInt(MIN_AMINO_PER_WAREHOUSE,MAX_AMINO_PER_WAREHOUSE); // amino amount to be created
    		warehouses.add(new Warehouse(nucleo,amino));   		
    	}
    	
    	for(int i = 0;i<shelterCount;i++) {
    		Gear[] g = new Gear[] {new ProtectiveCape(),new Gloves(),new Bag()};// Probably should be changed to switch case for performance purposes
    		int index = RandomInt(0,g.length);
    		shelters.add(new Shelter(g[index])); 
    	}
    	
    	List<City> cities = new LinkedList<City>();
    	
    	// Create cities
    	for(int i = 0;i<cityCount;i++) {
    		cities.add(new City());
    	}
    	
    	// Distribute buildings
    	
    	///
		/// Distribution goes as following:
    	///	s s s s s      -shelters
        ///         w w w  -warehouses
    	/// c c c c c c c  -cities    	

    	// Adding shelters
    	for(int i = 0;i<shelterCount;i++) {
    		cities.get(i).AddBuilding(shelters.get(i));
    	}
    	
    	// Adding warehouses
    	for(int i = 0;i<warehouseCount;i++) {
    		cities.get(cityCount-(i+1)).AddBuilding(warehouses.get(i));
    	}
    	
    	// Add cities to created fields
    	for(int i = 0;i<cityCount;i++) {
    		createdFields.add(cities.get(i));
    	}
    	
    	// Create free fields
    	int freeFieldCount = RandomInt(MIN_FREE_FIELDS,MAX_FREE_FIELDS+1);
    	for(int i = 0;i<freeFieldCount;i++) 
    		createdFields.add(new FreeField());
    	
    	// Connect fields
    	
    	///
    	/// We take a random field from the disconnected set and connect it to one or more of the connected set
    	///
    	List<Field> connectedFields = new LinkedList<Field>();
    	List<Field> disconnectedFields = new LinkedList<Field>();
    	for(int i = 0;i<createdFields.size();i++) { // copy all fields to disconnected
    		disconnectedFields.add(createdFields.get(i));
    	}
    	
    	while(disconnectedFields.size()>0) {
    		Field disconnected = disconnectedFields.get(RandomInt(0,disconnectedFields.size()));
    		if(connectedFields.size()==0) { // first interation, add a random field
    			connectedFields.add(disconnected);
    			disconnectedFields.remove(disconnected);
    		} else {
    			Field connected;
    			do {
    				connected = disconnectedFields.get(RandomInt(0,connectedFields.size()));
    			}while(connected.GetNeighbours().size()>=MAX_ROADS); // repick if selected already has max number of roads    			
    			connected.AddNeighbour(disconnected);
    			disconnected.AddNeighbour(connected);
    		}
    	}
    	
    	//TODO add extra connections if needed
    	//TODO place virologists
    	
    	
    	// Store created fields 
    	this.fields = createdFields;
    	Skeleton.LogReturn();
    }
    
    /**
     * Game has been won by a player
     */
    public void EndGame() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	System.out.println("A j�t�k v�get �rt, az �sszes genetikai k�dot megtanulta "+virologists.get(currentVirologistIndex).getName()); 
    	Skeleton.LogReturn();
    }
    
    /**
     * Ends the turn for current virologist and starts the turn for the next one
     */
    public void NextTurn() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	currentVirologistIndex = (currentVirologistIndex+1)%virologists.size();
    	virologists.get(currentVirologistIndex).Step();
    	Skeleton.LogReturn();
    }
    
    /**
     * Loads a saved game from the save folder with the filename "saveFile".save
     * @param saveFile Name of the file to be loaded
     */
    public static void LoadGame(String saveFile)  {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName(),saveFile);
    	try {
    		FileInputStream fis = new FileInputStream(new File("saves/"+saveFile+".save"));
    		ObjectInputStream ois = new ObjectInputStream(fis);
    	
    		try {
    			instance = (Game)ois.readObject();
    		}finally { // stream is open but write failed so close stream
    			ois.close();
    			fis.close();
    		}
    	
    	}catch(IOException e) { // stream could not be opened, so no need to close
    		System.out.println("Sikertelen bet�lt�s: "+e.getMessage());
    	}catch(ClassNotFoundException e) {
    		System.out.println("Sikertelen bet�lt�s, hib�s file");
    	}
    	Skeleton.LogReturn();
    }
    
    /**
     * Saves the game into the saves folder into the "saveFile".save file
     */
    public void SaveGame() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	try {
    		FileOutputStream fos = new FileOutputStream(new File("saves/"+saveFile+".save"));
    		ObjectOutputStream oos = new ObjectOutputStream(fos);
    	
    		try {
    			oos.writeObject(this);
    		}finally { // stream is open but write failed so close stream
    			oos.close();
    			fos.close();
    		}
    	
    	}catch(IOException e) { // stream could not be opened, so no need to close
    		System.out.println("Sikertelen ment�s: "+e.getMessage());
    	}
    	Skeleton.LogReturn();
    }
    
    public void ExitGame() {
    	Skeleton.LogFunctionCall(new Object() {}.getClass().getEnclosingMethod().getName());
    	System.exit(0);
    	Skeleton.LogReturn(); // probably will never be reached
    }
}
