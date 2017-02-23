package ted.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Theme {

	private int id;
	
	private String name;
	
	private String description;
	
	private String shortsummary;
	
	@JsonProperty("talks_description")
	private String talksDescription;
	
	@JsonProperty("speakers_description")
	private String speakersDescription;
	
	private String slug;
	
	@JsonProperty("is_featured")
	private boolean featured;

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
	 * A text description of this resource
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * A short text summary for this theme
	 */
	public String getShortsummary() {
		return shortsummary;
	}

	/**
	 * Text description of the talks associated with this theme
	 */
	public String getTalksDescription() {
		return talksDescription;
	}

	/**
	 * Text description for the speakers associated with this theme
	 */
	public String getSpeakersDescription() {
		return speakersDescription;
	}

	/**
	 * The text slug for this resource
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Boolean flag, set to true if this theme is featured on ted.com
	 */
	public boolean isFeatured() {
		return featured;
	}
}