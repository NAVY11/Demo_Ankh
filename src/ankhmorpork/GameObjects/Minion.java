/*
 * 
 */
package ankhmorpork.GameObjects;

// TODO: Auto-generated Javadoc
/**
 * The Class Minion.
 */
public class Minion {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{minion_id:" + minion_id + ", player_id:" + player_id
				+ ", color:" + color + ", active:" + active + ", area_id:"
				+ area_id + "}";
	}

	/** The minion_id. */
	Integer minion_id;
	
	/** The player_id. */
	Integer player_id;
	
	/** The color. */
	String color;
	
	/** The active. */
	Boolean active;	
	
	/** The area_id. */
	Integer area_id;
	
	/**
	 * Gets the minion_id.
	 *
	 * @return the minion_id
	 */
	public Integer getMinion_id() {
		return minion_id;
	}
	
	/**
	 * Sets the minion_id.
	 *
	 * @param minion_id the new minion_id
	 */
	public void setMinion_id(Integer minion_id) {
		this.minion_id = minion_id;
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
	public Integer getArea_id() {
		return area_id;
	}
	
	/**
	 * Sets the area_id.
	 *
	 * @param area_id the new area_id
	 */
	public void setArea_id(Integer area_id) {
		this.area_id = area_id;
	}
	
	/**
	 * Instantiates a new minion.
	 *
	 * @param MinionID the minion id
	 * @param Colour the colour
	 * @param AreaID the area id
	 * @param PlayerID the player id
	 */
	public Minion(Integer MinionID, String Colour, Integer AreaID, Integer PlayerID)
	{
		this.setActive(true);
		this.setMinion_id(MinionID);
		this.setColor(Colour);
		this.setArea_id(AreaID);
		this.setPlayer_id(PlayerID);
	}
	
	/**
	 * Instantiates a new minion.
	 */
	public Minion() {
		// TODO Auto-generated constructor stub
	}
}
