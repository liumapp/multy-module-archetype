package com.liumapp.common.model.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by liumapp on 10/9/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
@ImportResource(locations = {"classpath:/spring/applicationContext*.xml"})
public class Config {
}
