/*
 * 
 */
package ankhmorpork.GameObjects;

// TODO: Auto-generated Javadoc
/**
 * The Class Troll.
 */
public class Troll {

	/** The troll_id. */
	Integer troll_id;	
	
	/** The active. */
	Boolean active;
	
	/** The area_id. */
	Integer area_id;
	
	/**
	 * Gets the troll_id.
	 *
	 * @return the troll_id
	 */
	public Integer getTroll_id() {
		return troll_id;
	}
	
	/**
	 * Sets the troll_id.
	 *
	 * @param troll_id the new troll_id
	 */
	public void setTroll_id(Integer troll_id) {
		this.troll_id = troll_id;
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
	 * Instantiates a new troll.
	 *
	 * @param Troll_ID the troll_ id
	 */
	public Troll(Integer Troll_ID)
	{
		this.setActive(true);
		this.setArea_id(0);
		this.setTroll_id(Troll_ID);
	}
	
	/**
	 * Instantiates a new troll.
	 */
	public Troll()
	{
		
	}
}
