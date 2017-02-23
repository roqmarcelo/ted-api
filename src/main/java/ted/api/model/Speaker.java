package ted.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;

import ted.api.common.Constants;

public class Speaker {
	
	private int id;
	
	private String title;
	
	private String firstname;
	
	private String middleinitial;
	
	private String lastname;
	
	private String description;
	
	private String whotheyare;
	
	private String whylisten;
	
	private String slug;
	
	@JsonProperty("published_at")
	@JsonFormat(shape = Shape.STRING, pattern = Constants.DATE_FORMAT)
	private Date publishedAt;

	/**
	 * Unique identifier for this resource
	 */
	public int getId() {
		return id;
	}

	/**
	 * Professional title for this speaker
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * First name of the speaker
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Middle initial of the speaker
	 */
	public String getMiddleinitial() {
		return middleinitial;
	}

	/**
	 * Last name of the speaker
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * A text description of this resource
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Brief text description/bio of this speaker
	 */
	public String getWhotheyare() {
		return whotheyare;
	}

	/**
	 * A longer topical text description of this speaker
	 */
	public String getWhylisten() {
		return whylisten;
	}

	/**
	 * The text slug for this resource
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Date this information was published
	 */
	public Date getPublishedAt() {
		return publishedAt;
	}
}