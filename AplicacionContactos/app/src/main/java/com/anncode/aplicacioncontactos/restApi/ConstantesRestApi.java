package com.anncode.aplicacioncontactos.restApi;

/**
 * Created by MigueGrape on 11/04/2017.
 */

public final class ConstantesRestApi {

    //https://api.instagram.com/v1/
    public final String VERSION ="/v1/";
    public final String ROOT_URL ="https://api.instagram.com"+ VERSION;
    public final String ACCESS_TOKEN ="4946035890.f5487c5.820cc4d3a47f42ae82dbb8914a9cd6c0";
    public final String KEY_ACCESS_TOKEN ="?access_token=";
    public final String KEY_GET_INFORMATION_USER ="users/self/media/recent/";
    public final String URL_GET_INFORMATION_USER = KEY_GET_INFORMATION_USER + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    //https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN




}
