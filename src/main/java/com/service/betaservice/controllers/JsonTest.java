package com.service.betaservice.controllers;

import org.json.JSONObject;

public class JsonTest {

    public static void main(String[] args) {
        String amount = "1000";
        String type = "all in one";
        JSONObject bundle = new JSONObject();
        bundle.put("amount", amount)
                .put("type", type);
        refineBundles(bundle.toString());
    }

    private static void refineBundles(String bundle) {
        JSONObject finalBundle = new JSONObject(bundle);
        System.out.println(finalBundle.getString("type"));
    }
}
