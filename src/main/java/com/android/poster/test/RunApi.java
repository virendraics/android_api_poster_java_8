package com.android.poster.test;

import com.android.poster.delegate.AbstractServiceDelegate;
import com.android.poster.response.APIResponse;
import com.android.poster.test.callback.ApiCallback;
import com.android.poster.test.client.EgiftifyRestClient;
import com.android.poster.test.delegate.EgiftifyServiceDelegate;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Virendra
 * @since 28/06/24
 */
public class RunApi<REQUEST, RESPONSE> {

    public void fireApi(EgiftifyServiceDelegate serviceDelegate, REQUEST detail, Class<RESPONSE> output, ApiCallback<RESPONSE> apiCallback)
    {
        APIResponse<RESPONSE> apiResponse = EgiftifyRestClient.<REQUEST, RESPONSE>builder()
                .input(detail)
                .output(output)
                .serviceDelegate(serviceDelegate)
                .build()
                .fire();

        System.out.println("DDDDDDDDDDDDDDD : "+ new Gson().toJson(apiResponse.getDataList()));
        System.out.println("DDDDDDDDDDDDDDD : "+ new Gson().toJson(apiResponse));

        if(apiCallback != null)
            apiCallback.notify(null, apiResponse);
    }


    public void fireQueryParamApi(AbstractServiceDelegate serviceDelegate, HashMap<String, String> params, Class output, ApiCallback<RESPONSE> apiCallback)
    {
        APIResponse apiResponse = EgiftifyRestClient.builder()
                .queryParam(params)
                .output(output)
                .serviceDelegate(serviceDelegate)
                .build()
                .fire();

        System.out.println("DDDDDDDDDDDDDDD : "+ new Gson().toJson(apiResponse.getDataList()));
    }

}
