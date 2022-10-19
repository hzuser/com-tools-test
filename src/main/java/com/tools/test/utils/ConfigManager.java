package com.tools.test.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    private static Logger logger = LoggerFactory.getLogger(ConfigManager.class);
    private static Properties pConfFile = new Properties();
    public static final String DEFAULT_ENV_FILENAME = "application.yml";
    public static final String PROPERTY_ENV = "spring.profiles.active";
    private static final String[] envs = new String[]{"test1", "test2", "test3", "local"};
    public static final String DEFAULT_ENV = "local";
    public static final String LOCAL_ENV_FILENAME = "application.yml";
    public static final String env = getDefaultEnv();

    public ConfigManager() {
    }

    public static String getConfigValue(String key) {
        return getEnvConfigValue(key, getDefaultEnv());
    }

    public static String getEnvConfigValue(String key, String env) {
        logger.debug(String.format("get key:%s, env:%s", key, env));
        String filepath = "application.yml";
        if (!env.equals("local")) {
            filepath = "application-" + env + ".properties";
        }

        logger.debug("filepath={}", filepath);
        String value = "";
        value = getConfigValue(key, filepath);
        return value;
    }

    public static String getConfigValue(String key, String confFile) {
        logger.debug(String.format("get key:%s, confFile:%s", key, confFile));
        if (!pConfFile.containsKey(key)) {
            try {
                InputStream inputStream = ConfigManager.class.getClassLoader().getResourceAsStream(confFile);
                if (null != inputStream) {
                    pConfFile.load(inputStream);
                }
            } catch (IOException var3) {
                logger.error(var3.getMessage());
            }
        }

        String value = System.getProperty(key);
        if (null != value) {
            return value;
        } else {
            logger.debug(String.format("get key:%s, value:%s", key, pConfFile.getProperty(key)));
            return pConfFile.getProperty(key);
        }
    }

    private static String getDefaultEnv() {
        String result = getConfigValue("spring.profiles.active", "application.yml");
        return StringUtils.isEmpty(result) ? "local" : result;
    }
}
