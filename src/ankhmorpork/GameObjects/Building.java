
/*
 * 
 */
package ankhmorpork.GameObjects;

// TODO: Auto-generated Javadoc
/**
 * The Class Building.
 */
public class Building {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{building_id:" + building_id + ", player_id:"
				+ player_id + ", color:" + color + ", active:" + active
				+ ", area_id:" + area_id + "}";
	}

	/** The building_id. */
	Integer building_id;
	
	/** The player_id. */
	Integer player_id;
	
	/** The color. */
	String color;
	
	/** The active. */
	Boolean active;
	
	/** The area_id. */
	int area_id;
	
	/**
	 * Gets the building_id.
	 *
	 * @return the building_id
	 */
	public Integer getBuilding_id() {
		return building_id;
	}
	
	/**
	 * Sets the building_id.
	 *
	 * @param building_id the new building_id
	 */
	public void setBuilding_id(Integer building_id) {
		this.building_id = building_id;
	}
	
	/**
	 * Gets the player_id.
	 *
	 * @return the player_id
	 */
	public Integer getPlayer_id() {
		return player_id;
	}
	
	/**
	 * Sets the player_id.
	 *
	 * @param player_id the new player_id
	 */
	public void setPlayer_id(Integer player_id) {
		this.player_id = player_id;
	}
	
	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Gets the active.
	 *
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}
	
	/**
	 * Sets the active.
	 *
	 * @param active the new active
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	/**
	 * Gets the area_id.
	 *
	 * @return the area_id
	 */
	public int getArea_id() {
		return area_id;
	}
	
	/**
	 * Sets the area_id.
	 *
	 * @param area_id the new area_id
	 */
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}	
	
	/**
	 * Instantiates a new building.
	 *
	 * @param BuildingID the building id
	 * @param Colour the colour
	 * @param AreaID the area id
	 * @param PlayerID the player id
	 */
	public Building(Integer BuildingID, String Colour, Integer AreaID, Integer PlayerID)
	{
		this.setActive(true);
		this.setBuilding_id(BuildingID);
		this.setColor(Colour);
		this.setArea_id(AreaID);
		this.setPlayer_id(PlayerID);
	}
	
	/**
	 * Instantiates a new building.
	 */
	public Building() {
		// TODO Auto-generated constructor stub
	}
}
