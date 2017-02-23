package ted.api.resource;

import java.util.List;

import javax.ws.rs.client.WebTarget;

import ted.api.client.Endpoints;
import ted.api.model.Country;

public final class CountryResource extends Resource<Country> {

	public CountryResource(final WebTarget target, final String apiKey) {
		super(target, apiKey, Country.class);
	}

	@Override
	public List<Country> get() {
		return executeGet(Endpoints.COUNTRIES);
	}

	@Override
	public Country get(String id) {
		return executeGet(Endpoints.COUNTRY_DETAIL, id);
	}
}