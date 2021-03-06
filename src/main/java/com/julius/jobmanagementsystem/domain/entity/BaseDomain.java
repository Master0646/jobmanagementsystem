package com.julius.jobmanagementsystem.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author julius
 * @date 2019/3/26
 * @time 13:58
 * 通用实体类
 **/
@Setter
@Getter
public class BaseDomain {
    //主键id
    private Long id;
    //当前登录用户的id/用户账号
    private Integer currentId;
    //当前登录用的姓名
    private String currentName;
    //当前登录用户的密码
    private String currentPwd;
    //当前页
    private Integer currentPage;
    //总页数
    private Integer totalPage;
    //每页显示的条数
    private Integer pageSize;
    //创建日期
    private Date createdDate;
    //更新日期
    private Date updatedDate;
    //删除状态位
    private Character deleteFlag;
}
