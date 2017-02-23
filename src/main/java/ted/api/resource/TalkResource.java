package ted.api.resource;

import java.util.List;

import javax.ws.rs.client.WebTarget;

import ted.api.client.Endpoints;
import ted.api.model.Talk;

public final class TalkResource extends Resource<Talk> {

	public TalkResource(final WebTarget target, final String apiKey) {
		super(target, apiKey, Talk.class);
	}

	@Override
	public List<Talk> get() {
		return executeGet(Endpoints.TALKS);
	}

	@Override
	public Talk get(String id) {
		return executeGet(Endpoints.TALK_DETAIL, id);
	}
}