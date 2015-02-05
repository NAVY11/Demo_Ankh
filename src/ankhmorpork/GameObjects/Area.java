/*
 * 
 */
package ankhmorpork.GameObjects;

import java.util.ArrayList;
import java.util.HashMap;


// TODO: Auto-generated Javadoc
/**
 * The Class Area.
 */
public class Area {

	/** The area_id. */
	private Integer area_id = 0;
	
	/** The area_name. */
	private String area_name;
	
	/** The area_cost. */
	private Integer area_cost;
	
	/** The belongs_to. */
	private Integer belongs_to;
	
	
	
	/**
	 * Gets the area id.
	 *
	 * @return the area id
	 */
	public Integer getAreaID()
	{
		return area_id;
	}
	
	/**
	 * Sets the area id.
	 *
	 * @param area_id the new area id
	 */
	public void setAreaID(Integer area_id)
	{
		this.area_id= area_id;
	}
	
	/**
	 * Gets the area cost.
	 *
	 * @return the area cost
	 */
	public Integer getAreaCost()
	{
		return area_cost;
	}
	
	/**
	 * Sets the area cost.
	 *
	 * @param area_cost the new area cost
	 */
	public void setAreaCost(Integer area_cost)
	{
		this.area_cost= area_cost;
	}
	
	/**
	 * Gets the area name.
	 *
	 * @return the area name
	 */
	public String getAreaName()
	{
		return area_name;
	}
	
	/**
	 * Sets the area name.
	 *
	 * @param area_name the new area name
	 */
	public void setAreaName(String area_name)
	{
		this.area_name= area_name;
	}
	
	/**
	 * Gets the area belongs to.
	 *
	 * @return the area belongs to
	 */
	public Integer getAreaBelongsTo()
	{
		return belongs_to;
	}
	
	/**
	 * Sets the area belongs to.
	 *
	 * @param belongs_to the new area belongs to
	 */
	public void setAreaBelongsTo(Integer belongs_to)
	{
		this.belongs_to= belongs_to;
	}
	
	/**
	 * Instantiates a new area.
	 *
	 * @param AreaID the area id
	 * @param AreaCost the area cost
	 * @param AreaName the area name
	 * @param BelongsTo the belongs to
	 */
	public Area(Integer AreaID, Integer AreaCost, String AreaName, Integer BelongsTo)
	{
		area_id=AreaID;
		area_cost=AreaCost;
		area_name=AreaName;
		belongs_to=BelongsTo;
	}
	
	/** The lst minions. */
	public static ArrayList<Minion> lstMinions = new ArrayList<Minion>();
	
	/** The lst trouble makers. */
	public static ArrayList<TroubleMaker> lstTroubleMakers = new ArrayList<TroubleMaker>();
	
	/** The lst buildings. */
	public static ArrayList<Building> lstBuildings = new ArrayList<Building>();
	
	/** The lst demons. */
	public static ArrayList<Demon> lstDemons = new ArrayList<Demon>();
	
	/** The lst trolls. */
	public static ArrayList<Troll> lstTrolls = new ArrayList<Troll>();
	
	/**
	 * Gets the list of minions by area id arr.
	 *
	 * @return the list of minions by area id arr
	 */
	public ArrayList<Area> getListOfMinionsByAreaIdArr(){
		ArrayList<Area> areaListArr = new ArrayList<Area>();
		
		for(int i = 1; i <= 12; i++){
			
		}
		return areaListArr;
	}
	
	/**
	 * Gets the area id and str of minions.
	 *
	 * @return the area id and str of minions
	 */
	public HashMap<Integer, String> getAreaIdAndStrOfMinions(){
		
		HashMap<Integer, String> mapOfAreaIdAndStrOfMinions = new HashMap<Integer, String>();  
		for(int i = 1; i < 12; i++){
			mapOfAreaIdAndStrOfMinions.put(i, getListOfMinionsByAreaId(i));
		}
		return mapOfAreaIdAndStrOfMinions;
	}
	
	/**
	 * Gets the list of minions by area id.
	 *
	 * @param cityAreaId the city area id
	 * @return the list of minions by area id
	 */
	public static String getListOfMinionsByAreaId(Integer cityAreaId){
		
		String listOfMinionsByColorId = "";
		for(Minion lstMinion : lstMinions){
			if(cityAreaId == lstMinion.getArea_id()){
				listOfMinionsByColorId += ""+lstMinion.getColor()+",";
			}
		}
		if (listOfMinionsByColorId.endsWith(",")) {
			listOfMinionsByColorId = listOfMinionsByColorId.substring(0, listOfMinionsByColorId.length() - 1);
		}else{
			listOfMinionsByColorId = "none";
		}
		
		return listOfMinionsByColorId; 
	}
	
	/**
	 * Gets the area id and str of trouble makers.
	 *
	 * @return the area id and str of trouble makers
	 */
	public HashMap<Integer, String> getAreaIdAndStrOfTroubleMakers(){
		
		HashMap<Integer, String> mapOfAreaIdAndStrOfTroubleMakers = new HashMap<Integer, String>();  
		for(int i = 1; i < 12; i++){
			mapOfAreaIdAndStrOfTroubleMakers.put(i, getListOfTroubleMakersByAreaId(i));
		}
		return mapOfAreaIdAndStrOfTroubleMakers;
	}
	
	/**
	 * Gets the list of trouble makers by area id.
	 *
	 * @param cityAreaId the city area id
	 * @return the list of trouble makers by area id
	 */
	public static String getListOfTroubleMakersByAreaId(Integer cityAreaId){
		
		String listOfTroubleMakersByColorId = "no";
		for(TroubleMaker lstTroubleMaker : lstTroubleMakers){
			if(cityAreaId == lstTroubleMaker.getArea_id()){
				listOfTroubleMakersByColorId ="yes";
				break;
			}
		}
		
		return listOfTroubleMakersByColorId; 
	}
	
	/**
	 * Gets the area id and str of buildings.
	 *
	 * @return the area id and str of buildings
	 */
	public HashMap<Integer, String> getAreaIdAndStrOfBuildings(){
		
		HashMap<Integer, String> mapOfAreaIdAndStrOfBuildings = new HashMap<Integer, String>();  
		for(int i = 1; i < 12; i++){
			mapOfAreaIdAndStrOfBuildings.put(i, getListOfBuildingsByAreaId(i));
		}
		return mapOfAreaIdAndStrOfBuildings;
	}
	
	/**
	 * Gets the list of buildings by area id.
	 *
	 * @param cityAreaId the city area id
	 * @return the list of buildings by area id
	 */
	public static String getListOfBuildingsByAreaId(Integer cityAreaId){
		
		String listOfBuildingsByColorId = "no";
		for(Building lstBuilding : lstBuildings){
			if(cityAreaId == lstBuilding.getArea_id()){
				listOfBuildingsByColorId ="yes";
				break;
			}
		}
		
		return listOfBuildingsByColorId; 
	}
	
	/**
	 * Gets the area id and str of demons.
	 *
	 * @return the area id and str of demons
	 */
	public HashMap<Integer, Integer> getAreaIdAndStrOfDemons(){
		
		HashMap<Integer, Integer> mapOfAreaIdAndStrOfDemons = new HashMap<Integer, Integer>();  
		for(int i = 1; i < 12; i++){
			mapOfAreaIdAndStrOfDemons.put(i, getListOfDemonsByAreaId(i));
		}
		return mapOfAreaIdAndStrOfDemons;
	}
	
	/**
	 * Gets the list of demons by area id.
	 *
	 * @param cityAreaId the city area id
	 * @return the list of demons by area id
	 */
	public static int getListOfDemonsByAreaId(Integer cityAreaId){
		
		int listOfDemonsByColorId = 0;
		for(Demon lstDemon : lstDemons){
			if(cityAreaId == lstDemon.getArea_id()){
				listOfDemonsByColorId = 1;
				break;
			}
		}
		
		return listOfDemonsByColorId; 
	}
	
	/**
	 * Gets the area id and str of trolls.
	 *
	 * @return the area id and str of trolls
	 */
	public HashMap<Integer, Integer> getAreaIdAndStrOfTrolls(){
		
		HashMap<Integer, Integer> mapOfAreaIdAndStrOfTrolls = new HashMap<Integer, Integer>();  
		for(int i = 1; i < 12; i++){
			mapOfAreaIdAndStrOfTrolls.put(i, getListOfTrollsByAreaId(i));
		}
		return mapOfAreaIdAndStrOfTrolls;
	}
	
	/**
	 * Gets the list of trolls by area id.
	 *
	 * @param cityAreaId the city area id
	 * @return the list of trolls by area id
	 */
	public static int getListOfTrollsByAreaId(Integer cityAreaId){
		
		int listOfTrollsByColorId = 0;
		for(Troll lstDemon : lstTrolls){
			if(cityAreaId == lstDemon.getArea_id()){
				listOfTrollsByColorId = 1;
				break;
			}
		}
		
		return listOfTrollsByColorId; 
	}
}

	
	

