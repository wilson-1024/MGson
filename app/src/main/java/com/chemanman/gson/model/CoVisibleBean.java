package com.chemanman.gson.model;

import com.google.gson.Gson;

/**
 * Creator  ming
 * Date     17/5/26
 * Email    skyar@live.cn
 */
public class CoVisibleBean {
    public boolean required;
    public boolean show;

    public static CoVisibleBean objectFromData(String str) {

        return new Gson().fromJson(str, CoVisibleBean.class);
    }
}
