package com.study.zyh.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;


    @TableId(type = IdType.AUTO)
    private int id;

    /**
     * 用户账号
     */
    private int userId;

    /**
     * 用户名称
     */
    private int userName;

    /**
     * 用户密码
     */
    private int password;
}
