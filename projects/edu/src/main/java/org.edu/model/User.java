package org.edu.model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 用户
 * Created by longjianlin on 15/4/29.
 */
public class User extends Model<User> {
    public static final User dao = new User();

    /**
     * 根据账号,密码查询用户
     *
     * @param account
     * @param password
     */
    public User findUser(final String account, final String password) {
        return dao.findFirst("select u.id,u.`name`,u.mobile,u.email,u.avatar,u.certificate,u.create_at from user u where (u.email =? or u.mobile=?) and u.password=?", account, account, password);
    }

    /**
     * 根据email查询用户
     *
     * @param email
     * @return
     */
    public User findUserByEmail(final String email) {
        return dao.findFirst("select u.id,u.`name`,u.mobile,u.email,u.avatar,u.certificate,u.create_at from user u where u.email =?", email);
    }

    /**
     * 根据mobile查询用户
     *
     * @param mobile
     * @return
     */
    public User findUserByMobile(final String mobile) {
        return dao.findFirst("select u.id,u.`name`,u.mobile,u.email,u.avatar,u.certificate,u.create_at from user u where u.mobile =?", mobile);
    }
}
