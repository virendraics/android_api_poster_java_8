package com.android.poster.test;

import com.android.poster.test.callback.ApiCallback;
import com.android.poster.test.delegate.LifelineServiceDelegate;
import com.android.poster.test.detail.MerchantUserDetail;
import com.android.poster.util.DebugLogger;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;

/**
 * @author Virendra
 * @version 6.1.0
 * @since 26-Jun-2024
 */
public class ApiTest {

    public static void main(String[] args) {

        DebugLogger.setEnvironment(DebugLogger.Environment.DEBUG);

//        LoginView loginView = new LoginView();
//        loginView.setUsername("terrace");
//        loginView.setPassword("welcome");
//
//        APIResponse<MerchantUserDetail> apiResponse = ProjectRestClient.<LoginView, MerchantUserDetail>builder()
//                .input(loginView)
//                .output(MerchantUserDetail.class)
//                .serviceDelegate(ProjectServiceDelegate.AUTH_LOGIN)
//                .build()
//                .fire();
//
//        System.out.println("DDDDDDDDDDDDDDD : "+ new Gson().toJson(apiResponse.getDataList()));


















     /*   LoginView loginView = new LoginView();
        loginView.setUsername("terrace");
        loginView.setPassword("welcome");

        new RunApi().fireApi(ProjectServiceDelegate.AUTH_LOGIN, loginView, MerchantUserDetail.class, new ApiCallback() {
            @Override
            public void onSuccess(List<Detail> result) {

            }
        });   // POST






        LoginView loginView1 = new LoginView();
        loginView1.setUsername("terrace");
        loginView1.setPassword("welcome");

        RunApi<LoginView, MerchantUserDetail> runApi = new RunApi<LoginView, MerchantUserDetail>();
        runApi.fireGenericApi(ProjectServiceDelegate.AUTH_LOGIN, loginView1, MerchantUserDetail.class, new NewApiCallback<MerchantUserDetail>() {
            @Override
            public void onSuccess(List<MerchantUserDetail> result) {

            }
        });   // POST*/

       /* LoginView loginView1 = new LoginView();
        loginView1.setUsername("terrace");
        loginView1.setPassword("welcome");

        RunApi<LoginView, MerchantUserDetail> runApi = new RunApi<LoginView, MerchantUserDetail>();
        runApi.fireApi(PortalServiceDelegate.AUTH_LOGIN, loginView1, MerchantUserDetail.class, new ApiCallback<MerchantUserDetail>() {
            @Override
            public void onSuccess(List<MerchantUserDetail> result) {
                System.out.println("DDDDDDDDDDDDDDD : "+ new Gson().toJson(result.get(0).getAuthToken()));
            }
        });*/

        // check balance
        HashMap<String, String> giftInfoParams = new HashMap<String, String>();
        giftInfoParams.put("authToken", "598497bf53e0539acd4fb360a4601f097256fb89cae6691998b92bdb86ff284c");
        giftInfoParams.put("giftCode", "82232991PR85911W");

        RunApi<HashMap, MerchantUserDetail> runApi1 = new RunApi<HashMap, MerchantUserDetail>();
        runApi1.fireApi(LifelineServiceDelegate.CHECK_BALANCE, giftInfoParams, MerchantUserDetail.class, new ApiCallback<MerchantUserDetail>() {
            @Override
            public void onSuccess(List<MerchantUserDetail> result) {
                System.out.println("DDDDDDDDDDDDDDD : "+ new Gson().toJson(result));
            }
        });

      /*  APIResponse<ThemeDetail> apiResponse = S3RestClient.<ThemeDetail, ThemeDetail>builder()
                .output(ThemeDetail.class)
                .serviceDelegate(S3ServiceDelegate.THEME)
                .build()
                .fire();

        System.out.println("DDDDDDDDDDDDDDD : "+ new Gson().toJson(apiResponse.getDataList()));*/



//        Map<String, String> param = new HashMap<>();
//        param.put("id", "1");
//        param.put("name", "Virendra");
//
//
//        RunApi<Map, Map> runApi = new RunApi<Map, Map>();
//        runApi.fireGenericApi(MerchantServiceDelegate.AUTH_LOGIN, param, Map.class, new NewApiCallback<Map>() {
//            @Override
//            public void onSuccess(List<Map> result) {
//
//                System.out.println(result.get(0).get("name"));
//
//            }
//        });
//















//
//        APIResponse apiResponse = ProjectRestClient.builder()
//                .input(null)
//                .output(ThemeDetail.class)
//                .serviceDelegate(S3ServiceDelegate.THEME)
//                .build()
//                .fire();
//
//        System.out.println("DDDDDDDDDDDDDDD : "+ new Gson().toJson(apiResponse.getDataList()));


//        Map<String, String> param = new HashMap<>();
//        param.put("id", "1");
//        param.put("name", "Virendra");
//        APIResponse apiResponse = ProjectRestClient.builder()
//                .input(param)
//                .output(CustomerDetail.class)
//                .serviceDelegate(ProjectServiceDelegate.GET_CUSTOMER_PARAM)
//                .build()
//                .fire();

     //   System.out.println("DDDDDDDDDDDDDDD : "+ new Gson().toJson(apiResponse.getDataList()));
    }
}
