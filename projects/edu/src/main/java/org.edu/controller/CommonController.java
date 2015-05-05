package org.edu.controller;

import com.jfinal.core.Controller;

/**
 * Created by longjianlin on 15/4/29.
 */
public class CommonController extends Controller {
    public void index() {
        String hello = "Hello world";
        renderJson(hello);
    }
}
