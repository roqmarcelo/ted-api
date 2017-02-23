package ted.api.resource;

import java.util.List;

import javax.ws.rs.client.WebTarget;

import ted.api.client.Endpoints;
import ted.api.model.Speaker;

public final class SpeakerResource extends Resource<Speaker> {

	public SpeakerResource(final WebTarget target, final String apiKey) {
		super(target, apiKey, Speaker.class);
	}

	@Override
	public List<Speaker> get() {
		return executeGet(Endpoints.SPEAKERS);
	}

	@Override
	public Speaker get(String id) {
		return executeGet(Endpoints.SPEAKER_DETAIL, id);
	}
}