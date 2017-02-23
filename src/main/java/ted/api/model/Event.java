package ted.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;

import ted.api.common.Constants;

public class Event {

	private int id;
	
	private String name;
	
	private String description;
	
	@JsonProperty("header_text")
	private String headerText;
	
	private String slug;
	
	private String url;
	
	@JsonProperty("starts_at")
	@JsonFormat(shape = Shape.STRING, pattern = Constants.DATE_FORMAT)
	private Date startsAt;
	
	@JsonProperty("ends_at")
	@JsonFormat(shape = Shape.STRING, pattern = Constants.DATE_FORMAT)
	private Date endsAt;

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
	 * For internal purposes
	 */
	public String getHeaderText() {
		return headerText;
	}

	/**
	 * The text slug for this resource
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * The official url for this event
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * The start date for this event
	 */
	public Date getStartsAt() {
		return startsAt;
	}

	/**
	 * The end date for this event
	 */
	public Date getEndsAt() {
		return endsAt;
	}
}