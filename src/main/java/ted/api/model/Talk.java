package ted.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;

import ted.api.common.Constants;

public class Talk {
	
	private int id;
	
	private String name;
	
	private String description;
	
	@JsonProperty("event_id")
	private int eventId;
	
	private String slug;
	
	@JsonProperty("native_language_code")
	private String nativeLanguageCode;
	
	@JsonProperty("published_at")
	private Date publishedAt;
	
	@JsonProperty("recorded_at")
	@JsonFormat(shape = Shape.STRING, pattern = Constants.DATE_FORMAT)
	private Date recordedAt;
	
	@JsonProperty("updated_at")
	@JsonFormat(shape = Shape.STRING, pattern = Constants.DATE_FORMAT)
	private Date updatedAt;

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
	 * The Id for the event associated with this talk
	 */
	public int getEventId() {
		return eventId;
	}

	/**
	 * Text slug for this talk
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Language code for this talk
	 */
	public String getNativeLanguageCode() {
		return nativeLanguageCode;
	}

	/**
	 * Date this talk was published
	 */
	public Date getPublishedAt() {
		return publishedAt;
	}

	/**
	 * Date this talk was recorded
	 */
	public Date getRecordedAt() {
		return recordedAt;
	}

	/**
	 * Date this talk was last updated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}
}