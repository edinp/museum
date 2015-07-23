package ba.bitcamp.day48.test.zaid;

public class Arts extends Exponat {
	
	public static enum era {RENAISSANCE, NEOCLASSIC, MODERN, CONTEMPORARY};
	
	private String author;
	private era artEra;
	

	/*
	 * Constructor for object Arts.
	 */
	public Arts(Integer id, String name, String description, String author, era artEra) {
		super(id, name, description);
		this.author = author;
		this.artEra = artEra;
	}

	/*
	 * Getters and setters.
	 */
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public era getArtEra() {
		return artEra;
	}

	public void setArtEra(era artEra) {
		this.artEra = artEra;
	}

	public String toString() {
		return "No." + this.getId() + ", '" + this.getName() + "' (" + this.getDescription() + ")" + " of author: " + author + ", era: " + artEra;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arts other = (Arts) obj;
		if (artEra == null) {
			if (other.artEra != null)
				return false;
		} else if (!artEra.equals(other.artEra))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}
	
	

}
