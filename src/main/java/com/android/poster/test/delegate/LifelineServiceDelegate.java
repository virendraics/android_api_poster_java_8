package com.android.poster.test.delegate;

import com.android.poster.http.HttpMethod;
import com.android.poster.payload.ContentType;

/**
 * Delegate for lifeline services
 * 
 * @author Virendra
 * @version 6.1.0
 * @since 26-Jun-2024
 */
public class LifelineServiceDelegate extends EgiftifyServiceDelegate
{
	/**
	 * @param apiEndpoint
	 * @param httpMethod
	 * @param contentType
	 */
	public LifelineServiceDelegate(String apiEndpoint, HttpMethod httpMethod, ContentType contentType) {
		super(apiEndpoint, httpMethod, contentType);
	}

	@Override
	public String getURL() {
		return getHost()
				+"/" + "eg_lifeline_services"
				+"/" + getApiEndpoint();
	}

	/**
	 * API to delivery digital gifts
	 */
	public static final LifelineServiceDelegate CHECK_BALANCE = new LifelineServiceDelegate("gift/checkBalance", HttpMethod.POST, ContentType.APPLICATION_FORM_URLENCODED);

}