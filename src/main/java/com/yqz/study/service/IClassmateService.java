package com.yqz.study.service;

import com.yqz.study.basic.exception.CommonException;
import com.yqz.study.entity.Classmate;

import java.util.List;

/*
 *
 * @Description 班级服务接口
 *
 * @author w15104
 * @data: 2019-3-5
 *
 * @modified by:
 * @modified date:
 * @modified no:
 */
public interface IClassmateService {

    List<Classmate> findClassByID(String id) throws CommonException;

}
