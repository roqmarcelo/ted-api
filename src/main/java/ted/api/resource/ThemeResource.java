package ted.api.resource;

import java.util.List;

import javax.ws.rs.client.WebTarget;

import ted.api.client.Endpoints;
import ted.api.model.Theme;

public final class ThemeResource extends Resource<Theme> {

	public ThemeResource(final WebTarget target, final String apiKey) {
		super(target, apiKey, Theme.class);
	}

	@Override
	public List<Theme> get() {
		return executeGet(Endpoints.THEMES);
	}

	@Override
	public Theme get(String id) {
		return executeGet(Endpoints.THEME_DETAIL, id);
	}
}