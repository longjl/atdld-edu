package org.edu.controller;

import com.jfinal.core.Controller;

/**
 * Created by longjianlin on 15/5/6.
 */
public class CategoryController extends Controller {
    public void index() {
        render("/category.html");
    }
}
