package ted.api.resource;

import java.util.List;

import javax.ws.rs.client.WebTarget;

import ted.api.client.Endpoints;
import ted.api.model.RatingWord;

public final class RatingWordResource extends Resource<RatingWord> {

	public RatingWordResource(final WebTarget target, final String apiKey) {
		super(target, apiKey, RatingWord.class);
	}

	@Override
	public List<RatingWord> get() {
		return executeGet(Endpoints.RATING_WORDS);
	}

	@Override
	public RatingWord get(String id) {
		return executeGet(Endpoints.RATING_WORD_DETAIL, id);
	}
}