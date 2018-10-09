package com.myblog.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zhaoyuming on 2018/10/9
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;   //用户名

    private String password;   //密码

    private String realName;   //真实姓名

    private String phone;      //手机号

    private String email;      //邮箱


}
