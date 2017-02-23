package ted.api.resource;

import java.util.List;

import javax.ws.rs.client.WebTarget;

import ted.api.client.Endpoints;
import ted.api.model.Event;

public final class EventResource extends Resource<Event> {

	public EventResource(final WebTarget target, final String apiKey) {
		super(target, apiKey, Event.class);
	}

	@Override
	public List<Event> get() {
		return executeGet(Endpoints.EVENTS);
	}

	@Override
	public Event get(String id) {
		return executeGet(Endpoints.EVENT_DETAIL, id);
	}
}