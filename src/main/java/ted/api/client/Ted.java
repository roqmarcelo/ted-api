package ted.api.client;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Map;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.common.collect.ImmutableMap;

import ted.api.resource.CountryResource;
import ted.api.resource.EventResource;
import ted.api.resource.LanguageResource;
import ted.api.resource.RatingWordResource;
import ted.api.resource.Resource;
import ted.api.resource.SpeakerResource;
import ted.api.resource.TagResource;
import ted.api.resource.TalkResource;
import ted.api.resource.ThemeResource;

public final class Ted {

    private Map<String, Resource<?>> resources;
	
	public Ted(final String apiKey) {
		checkNotNull(apiKey);
		
		JacksonJsonProvider provider = new JacksonJsonProvider().configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		
		WebTarget target = ClientBuilder.newClient().register(provider)
				.target(Endpoints.API_BASE)
				.path(Endpoints.API_KEY);
		
		initializeResources(target, apiKey);
	}
	
	public CountryResource countries() {
		return (CountryResource) resources.get("countries");
	}
	
	public EventResource events() {
		return (EventResource) resources.get("events");
	}
	
	public LanguageResource languages() {
		return (LanguageResource) resources.get("languages");
	}
	
	public RatingWordResource ratingWords() {
		return (RatingWordResource) resources.get("ratingWords");
	}
	
	public SpeakerResource speakers() {
		return (SpeakerResource) resources.get("speakers");
	}
	
	public TagResource tags() {
		return (TagResource) resources.get("tags");
	}
	
	public TalkResource talks() {
		return (TalkResource) resources.get("talks");
	}
	
	public ThemeResource themes() {
		return (ThemeResource) resources.get("themes");
	}
	
	private void initializeResources(final WebTarget target, final String apiKey) {
		resources = ImmutableMap.<String, Resource<?>> builder()
				.put("countries", new CountryResource(target, apiKey))
				.put("events", new EventResource(target, apiKey))
				.put("languages", new LanguageResource(target, apiKey))
				.put("ratingWords", new RatingWordResource(target, apiKey))
				.put("speakers", new SpeakerResource(target, apiKey))
				.put("tags", new TagResource(target, apiKey))
				.put("talks", new TalkResource(target, apiKey))
				.put("themes", new ThemeResource(target, apiKey))
				.build();
	}
}