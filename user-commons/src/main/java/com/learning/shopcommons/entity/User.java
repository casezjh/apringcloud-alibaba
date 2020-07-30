package com.learning.shopcommons.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: case
 * Date: 2020-07-30
 * Time: 17:41
 */
@Entity(name = "user") //实体与数据表的对应
@Data
public class User {
    @Id //表示主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //主键自增长
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 手机号
     */
    private String phoneNumber;
}
