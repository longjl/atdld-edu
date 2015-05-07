package org.edu.model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 用户导师关系
 * Created by longjianlin on 15/5/5.
 */
public class UserMentorRelation extends Model<UserMentorRelation> {
    public static final UserMentorRelation dao = new UserMentorRelation();
}
