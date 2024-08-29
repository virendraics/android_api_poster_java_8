package com.android.poster.payload;

import com.android.poster.util.ObjectUtil;

import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Implementation of the payload for parameter content.
 * 
 * @author Virendra
 * @version 6.1.0
 * @param <T>
 * @since 19-Aug-2024

 */
public class ParamPayload<T extends HashMap<String, String>> extends AbstractPayload<T>
{
	/**
	 * This method converts the payload's data (parameters) to a URL-encoded string format.
	 *
	 * @return A URL-encoded string representation of the payload's data.
	 *         Returns null if the data is null.
	 */
	@Override
	public RequestBody getContent()
	{
		final MediaType PARAM = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
		return RequestBody.create(ObjectUtil.mapToParamString(data), PARAM);
	}
}
