package ba.bitcamp.day48.test.zaid;

public class Historic extends Exponat {
	
	public enum time {CLASSIC, MIDDLE_AGE, MODERN_AGE};
	
	private String origin;
	private time historicTime;

	/*
	 * Constructor for object Historic (Artefect).
	 */
	public Historic(Integer id, String name, String description, String origin, time modernAge) {
		super(id, name, description);
		this.origin = origin;
		this.historicTime = modernAge;
	}

	/*
	 * Getters and setters.
	 */
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public time getHistoricTime() {
		return historicTime;
	}

	public void setHistoricTime(time historicTime) {
		this.historicTime = historicTime;
	}
	
	public String toString() {
		return "No." + this.getId() + ", '" + this.getName() + "' (" + this.getDescription() + ")" + " origin: " + origin + ", time: " + historicTime;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Historic other = (Historic) obj;
		if (historicTime == null) {
			if (other.historicTime != null)
				return false;
		} else if (!historicTime.equals(other.historicTime))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}
	
	
	

}
