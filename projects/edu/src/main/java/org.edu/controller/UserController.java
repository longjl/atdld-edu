package org.edu.controller;

import com.jfinal.core.Controller;
import org.edu.model.User;
import org.edu.util.Md5Util;

import java.util.Date;

/**
 * Created by longjianlin on 15/4/29.
 */
public class UserController extends Controller {
    private static String msg;  //操作信息

    /**
     * login
     */
    public void login() {
        render("/login.html");
    }

    /**
     * register
     */
    public void register() {
        render("/register.html");
    }

    /**
     * save user data
     */
    public void save() {
        //消息
        String name = getPara("name");          //名字
        String email = getPara("email");        //电子邮件
        String mobile = getPara("mobile");      //手机号
        String password = getPara("password");  //密码

        //判断email是否存在
        if (User.dao.findUserByEmail(email) != null) {
            msg = "电子邮件已经被注册";
            setAttrRegister(msg, name, email, mobile, password);
            forwardAction("/user/register");
            return;
        }
        //判断手机号是否存在
        if (User.dao.findUserByMobile(mobile) != null) {
            msg = "手机号码已经被注册";
            setAttrRegister(msg, name, email, mobile, password);
            forwardAction("/user/register");
            return;
        }
        try {
            User user = new User().set("name", name)
                    .set("email", email)
                    .set("mobile", mobile)
                    .set("password", Md5Util.createPassword(password))
                    .set("certificate", 0)
                    .set("create_at", new Date());
            boolean isSave = user.save();

            if (isSave) {
                setCookieUser(user);
                redirect("/category");
            } else {
                msg = "注册失败,系统错误";
                setAttrRegister(msg, name, email, mobile, password);
                forwardAction("/user/register");
            }
        } catch (Exception e) {
            msg = "注册失败,系统错误";
            setAttrRegister(msg, name, email, mobile, password);
            forwardAction("/user/register");
        }
    }


    /**
     * 用户登录
     */
    public void do_login() {
        String account = getPara("account");    //登录账号
        String password = getPara("password");  //密码
        try {
            User user = User.dao.findUser(account, Md5Util.createPassword(password));
            if (user != null) {
                setCookieUser(user);
                redirect("/");//返回首页
            }else{
                setAttrLogin(msg, account, password);
                forwardAction("/user/login");
            }
        } catch (Exception e) {
            msg = "登录失败,系统错误";
            setAttrLogin(msg, account, password);
            forwardAction("/user/login");
        }
    }

    /**
     * 保存注册错误信息
     *
     * @param msg
     * @param name
     * @param email
     * @param mobile
     * @param password
     */
    private void setAttrRegister(String msg, String name, String email, String mobile, String password) {
        setAttr("msg", msg);
        setAttr("name", name);
        setAttr("email", email);
        setAttr("mobile", mobile);
        setAttr("password", password);
    }

    /**
     * 保存登录错误信息
     *
     * @param msg
     * @param account
     * @param password
     */
    private void setAttrLogin(String msg, String account, String password) {
        setAttr("msg", msg);
        setAttr("account", account);
        setAttr("password", password);
    }

    /**
     * 登录成功 保存Session数据
     *
     * @param user
     */
    private void setCookieUser(final User user) {
        if (user != null) {
            setCookie("name", user.getStr("name"), -1, "/");
            setCookie("u_id", user.getLong("id") + "", -1, "/");
        }
    }
}
