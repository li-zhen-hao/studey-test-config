package com.config.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author li
 * 2019/1/19 21:20
 * version 1.0
 */

/**
 * 讲配置文件中配置的每一个属性的值 映射到这个组件中
 * @ConfigurationProperties 告诉springboot将本类中的所有属性和配置文件中相关的配置进行绑定
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = "classpath:person.properties")
public class Person implements Serializable {

    //@Value("${person.last-name}")
    private String lastname;
    //@Value("#{22*10}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
    private Date birtg;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

}
