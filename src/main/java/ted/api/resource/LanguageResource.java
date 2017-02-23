package ted.api.resource;

import java.util.List;

import javax.ws.rs.client.WebTarget;

import ted.api.client.Endpoints;
import ted.api.model.Language;

public final class LanguageResource extends Resource<Language> {

	public LanguageResource(final WebTarget target, final String apiKey) {
		super(target, apiKey, Language.class);
	}

	@Override
	public List<Language> get() {
		return executeGet(Endpoints.LANGUAGES);
	}

	@Override
	public Language get(String id) {
		return executeGet(Endpoints.LANGUAGE_DETAIL, id);
	}
}