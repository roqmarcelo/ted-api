package ted.api.model;

public class Country {

	private int id;

	private String name;
	
	private String code;

	/**
	 * Unique identifier for this resource
	 */
	public int getId() {
		return id;
	}

	/**
	 * The name of this resource
	 */
	public String getName() {
		return name;
	}

	/**
	 * Abbreviated country code for the country
	 */
	public String getCode() {
		return code;
	}
}