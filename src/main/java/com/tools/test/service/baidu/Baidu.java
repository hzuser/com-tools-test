package com.tools.test.service.baidu;

import com.tools.test.utils.ConfigManager;
import com.tools.test.utils.OkHttpUtils;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Baidu {
    static String url = ConfigManager.getConfigValue("baidu.url");


    public static String baidu(){
        String response = OkHttpUtils.httpGet(url);
        log.info("返回参数："+ response);
        return response;
    }

}
