package org.edu;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import org.edu.controller.CategoryController;
import org.edu.controller.CommonController;
import org.edu.controller.UserController;
import org.edu.model.Category;
import org.edu.model.User;
import org.edu.model.UserCategoryRelation;
import org.edu.model.UserMentorRelation;
import org.edu.util.PropertiesContent;


/**
 * Main
 */
public class Main extends JFinalConfig {
    /**
     * 配置常量
     */
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    /**
     * 配置路由
     */
    public void configRoute(Routes me) {
        me.add("/", CommonController.class);
        me.add("/user", UserController.class);
        me.add("/category", CategoryController.class);
    }

    /**
     * 配置插件
     */
    public void configPlugin(Plugins me) {
        // 配置数据库连接池插件
        DruidPlugin druidPlugin = new DruidPlugin(PropertiesContent.get("jdbc.url"),
                PropertiesContent.get("jdbc.username"),
                PropertiesContent.get("jdbc.password"),
                PropertiesContent.get("jdbc.driver"));
        me.add(druidPlugin);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
        arp.setShowSql(true);
        arp.addMapping("user", "id", User.class);
        arp.addMapping("category", "id", Category.class);
        arp.addMapping("user_category_relation", "id", UserCategoryRelation.class);
        arp.addMapping("user_mentor_relation", "id", UserMentorRelation.class);
        me.add(arp);
    }

    /**
     * 配置全局拦截器
     */
    public void configInterceptor(Interceptors me) {
        me.add(new SessionInViewInterceptor());
    }

    /**
     * 配置处理器
     */
    public void configHandler(Handlers me) {

    }

    public static void main(String[] args) throws Exception {
        JFinal.start("/Users/longjianlin/Documents/longjl-dev/atdld-edu/projects/edu/src/main/webapp", 9000, "/", 5);
    }
}

