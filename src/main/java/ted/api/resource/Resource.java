package ted.api.resource;

import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import ted.api.client.Endpoints;

public abstract class Resource<T> {
	
	private WebTarget target;
	
	private String apiKey;
	
	private Class<T> type;
	
	public Resource(final WebTarget target, final String apiKey, final Class<T> type) {
		this.target = target;
		this.apiKey = apiKey;
		this.type = type;
	}
	
	protected List<T> executeGet(final String path) {
		return target.path(path)
				.queryParam(Endpoints.API_KEY, apiKey)
				.request()
				.get(new GenericType<List<T>>(type));
	}
	
	protected T executeGet(String path, String id) {
		return target.path(String.format(path, id))
				.queryParam(Endpoints.API_KEY, apiKey)
				.request()
				.get(type);
	}
	
	public abstract List<T> get();
	
	public abstract T get(String id);
}