package ted.api.client;

public final class Endpoints {

	protected static final String API_BASE = "https://api.ted.com";
	
	protected static final String API_VERSION = "v1";
	
	public static final String API_KEY = "api-key";
	
	public static final String COUNTRIES = "countries.json";
	public static final String COUNTRY_DETAIL = "countries/%s.json";
	
	public static final String EVENTS = "events.json";
	public static final String EVENT_DETAIL = "events/%s.json";
	
	public static final String LANGUAGES = "languages.json";
	public static final String LANGUAGE_DETAIL = "languages/%s.json";
	
	public static final String RATING_WORDS = "rating_words.json";
	public static final String RATING_WORD_DETAIL = "rating_words/%s.json";
	
	public static final String SPEAKERS = "speakers.json";
	public static final String SPEAKER_DETAIL = "speakers/%s.json";
	
	public static final String TAGS = "tags.json";
	public static final String TAG_DETAIL = "tags/%s.json";
	
	public static final String TALKS = "talks.json";
	public static final String TALK_DETAIL = "talks/%s.json";
	
	public static final String THEMES = "themes.json";
	public static final String THEME_DETAIL = "themes/%s.json";
	
	private Endpoints() {
		throw new IllegalArgumentException();
	}
}