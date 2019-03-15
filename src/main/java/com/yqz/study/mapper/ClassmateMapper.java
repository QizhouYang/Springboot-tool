package com.yqz.study.mapper;

import java.util.List;

import com.yqz.study.entity.Classmate;

/*
 *
 * @Description 班级Mapper
 *
 * @author w15104
 * @data: 2019-3-5
 *
 * @modified by:
 * @modified date:
 * @modified no:
 */
public interface ClassmateMapper {

    /**
     * 根据班级ID查找班级信息
     * @param id ID
     * @return List<Classmate>
     */
    List<Classmate> findClassByID(String id);

}
