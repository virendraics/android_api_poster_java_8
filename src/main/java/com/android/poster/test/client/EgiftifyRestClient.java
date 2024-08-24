package com.android.poster.test.client;

import com.android.poster.client.AbstractRestClient;
import com.android.poster.test.KeyGen;
import com.android.poster.test.delegate.EgiftifyServiceDelegate;
import com.android.poster.util.ObjectUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import okhttp3.Headers;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Rest client for eGiftify APIs
 * 
 * @author Virendra
 * @version 6.1.0
 * @since 26-Jun-2024
 */
@Setter
@Getter
@SuperBuilder
public class EgiftifyRestClient<REQUEST, RESPONSE> extends AbstractRestClient<REQUEST, RESPONSE, EgiftifyServiceDelegate>
{
	private static String apiKey = "8132f647466c238a80dd33cd67352d683cd67352d6";
	
	private static String secretKey = "455c3c14dc797c3a13ee2fae5d72c939b2e216dd52";
	
	@Override
	public Map<String, String> cookies()
	{
		final String timeStamp = KeyGen.getTimeStamp();
		final Map<String, String> cookiesMap = new HashMap<String, String>() {{
			put("x-timestamp", timeStamp);
			put("api_key", apiKey);
			put("currentVersion", "14");
			put("Launcher", "Android API poster");
		}};


		if(additionalCookie != null)
		   cookiesMap.putAll(additionalCookie);
		return cookiesMap;
	}

	@Override
	public Headers headers()
	{
		final String cookieString = cookies().entrySet()
				.stream()
				.map(entry -> entry.getKey() + "=" + (ObjectUtil.isNotEmpty(entry.getValue()) ? entry.getValue() : ""))
				.collect(Collectors.joining(";"));

		final Headers.Builder headersBuilder = Headers.of(
				"Accept", "application/json",
				"Content-Type", serviceDelegate.getContentType().toString(),
				"Cookie", cookieString,
				"Launcher", "Android"
		).newBuilder();

		if (additionalHeader != null) {
			headersBuilder.addAll(Headers.of(additionalHeader));
		}
		return headersBuilder.build();
	}
}