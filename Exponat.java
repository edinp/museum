package ba.bitcamp.day48.test.zaid;

import java.util.StringTokenizer;

public class Exponat implements Comparable<Exponat>, Searchable {

	private Integer id;
	private String name;
	private String description;

	/*
	 * Constructor for object Exponat.
	 */
	public Exponat(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	/*
	 * Getters and setters.
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "No." + id + ", '" + name + "' (" + description + ")";

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exponat other = (Exponat) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Exponat o) {
		return this.name.compareTo(o.name);
	}
	
	/*
	 * Searching through an object for entered String.
	 */
	@Override
	public boolean fitsSearch(String str) {
		StringTokenizer st = new StringTokenizer(this.description, " ");
		while (st.hasMoreTokens()) {
			if (st.nextToken().equalsIgnoreCase(str)) {
				return true;
			}
		}
		String idstr = String.valueOf(this.id);
		if (this.name.equalsIgnoreCase(str) || idstr.equalsIgnoreCase(str)) {
			return true;
		}
		return false;
	}
}
