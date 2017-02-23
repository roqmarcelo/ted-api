package ted.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Language {

	private String name;
	
	private String description;
	
	@JsonProperty("language_code")
	private String languageCode;

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
	 * The text code for this language
	 */
	public String getLanguageCode() {
		return languageCode;
	}
}