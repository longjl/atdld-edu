package org.edu.controller;

import com.jfinal.core.Controller;
import org.edu.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by longjianlin on 15/4/29.
 */
public class UserController extends Controller {

    public void login() {
        renderJson("login");
    }

    /**
     * 查询用户列表
     */
    public void list() {
        List<User> list = User.dao.find("select * from user_user");
        Map<String, Object> map = new HashMap<String, Object>();
        if (list != null && list.size() > 0) {
            map.put("code", 200);
            map.put("data", list);
        } else {
            map.put("code", 100);
            map.put("data", "");
        }
        renderJson(map);
    }
}
