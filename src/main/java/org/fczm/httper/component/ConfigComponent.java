package org.fczm.httper.component;

import org.fczm.common.util.JsonTool;
import org.fczm.httper.component.config.Facebook;
import org.fczm.httper.component.config.Global;
import org.fczm.httper.component.config.Mail;
import org.springframework.stereotype.Component;

@Component
public class ConfigComponent {

    public static final String ConfigPath = "/WEB-INF/config.json";

    public String DefaultAvatar = "/static/images/avatar.png";
    public String AvatarPath = "/files/avatar";

    public String rootPath;
    public JsonTool configTool = null;
    public Mail mail;
    public Global global;
    public Facebook facebook;

    public ConfigComponent() {
        rootPath = this.getClass().getClassLoader().getResource("/").getPath().split("WEB-INF")[0];
        load();
    }

    public void load() {
        String pathname = rootPath + ConfigPath;
        configTool = new JsonTool(pathname);
        global = new Global(configTool.getJSONObject("global"));
        mail = new Mail(configTool.getJSONObject("mail"));
        facebook = new Facebook(configTool.getJSONObject("facebook"));
    }

}
