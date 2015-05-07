package org.edu.controller;

import com.jfinal.core.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by longjianlin on 15/4/29.
 */
public class CommonController extends Controller {
    public void index() {
        render("index.html");
    }


    /**
     * 获取登录信息
     */
    public void get_login_info() {
        String name = getCookie("name");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", name == null || name.length() == 0 ? "" : name);
        renderJson(map);
    }

    /**
     * 退出系统
     */
    public void logout() {
        if (getCookie("name") != null && getCookie("name").length() > 0) {
            removeCookie("name");
        }
        if (getCookie("u_id") != null && getCookie("u_id").length() > 0) {
            removeCookie("u_id");
        }
        renderJson();
    }
}
