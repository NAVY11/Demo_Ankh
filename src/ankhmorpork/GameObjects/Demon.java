/*
 * 
 */
package ankhmorpork.GameObjects;

// TODO: Auto-generated Javadoc
/**
 * The Class Demon.
 */
public class Demon {

	@Override
	public String toString() {
		return "Demon [demon_id=" + demon_id + ", active=" + active
				+ ", area_id=" + area_id + "]";
	}

	/** The demon_id. */
	Integer demon_id;	
	
	/** The active. */
	Boolean active;	
	
	/** The area_id. */
	Integer area_id;
	
	/**
	 * Gets the demon_id.
	 *
	 * @return the demon_id
	 */
	public Integer getDemon_id() {
		return demon_id;
	}
	
	/**
	 * Sets the demon_id.
	 *
	 * @param demon_id the new demon_id
	 */
	public void setDemon_id(Integer demon_id) {
		this.demon_id = demon_id;
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
	 * Instantiates a new demon.
	 *
	 * @param Demon_ID the demon_ id
	 */
	public Demon(Integer Demon_ID)
	{
		this.setActive(true);
		this.setArea_id(0);
		this.setDemon_id(Demon_ID);
	}
	
	/**
	 * Instantiates a new demon.
	 */
	public Demon()
	{
		
	}
}
