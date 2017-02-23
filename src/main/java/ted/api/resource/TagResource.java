package ted.api.resource;

import java.util.List;

import javax.ws.rs.client.WebTarget;

import ted.api.client.Endpoints;
import ted.api.model.Tag;

public final class TagResource extends Resource<Tag> {

	public TagResource(final WebTarget target, final String apiKey) {
		super(target, apiKey, Tag.class);
	}

	@Override
	public List<Tag> get() {
		return executeGet(Endpoints.TAGS);
	}

	@Override
	public Tag get(String id) {
		return executeGet(Endpoints.TAG_DETAIL, id);
	}
}