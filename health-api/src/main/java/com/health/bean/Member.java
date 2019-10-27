package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员
 */
@Data
public class Member implements Serializable {

    private static final long serialVersionUID = -7096586519975486811L;

    private Integer id;

    private String filenumber;

    private String name;

    private String sex;

    private String idcard;

    private String phonenumber;

    private Date regtime;

    private String password;

    private String email;

    private Date birthday;

    private String remark;
}