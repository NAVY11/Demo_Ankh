/*
 * 
 */
package ankhmorpork.GameObjects;

// TODO: Auto-generated Javadoc
/**
 * The Class TroubleMaker.
 */
public class TroubleMaker {
	
	@Override
	public String toString() {
		return "TroubleMaker [tm_id=" + tm_id + ", area_id=" + area_id
				+ ", active=" + active + "]";
	}

	/** The tm_id. */
	private Integer tm_id;
	
	/** The area_id. */
	private Integer area_id;
	
	/** The active. */
	private Boolean active;
		

	/**
	 * Instantiates a new trouble maker.
	 *
	 * @param ID the id
	 */
	public TroubleMaker(int ID) {
		this.setTm_id(ID);
		this.setArea_id(0);
		this.setActive(true);		
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new trouble maker.
	 */
	public TroubleMaker() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the tm_id.
	 *
	 * @return the tm_id
	 */
	public Integer getTm_id() {
		return tm_id;
	}
	
	/**
	 * Sets the tm_id.
	 *
	 * @param tm_id the new tm_id
	 */
	public void setTm_id(Integer tm_id) {
		this.tm_id = tm_id;
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
}
