package com.yqz.study.service.impl;

import com.yqz.study.basic.exception.CommonException;
import com.yqz.study.basic.exception.ErrorCode;
import com.yqz.study.entity.Classmate;
import com.yqz.study.mapper.ClassmateMapper;
import com.yqz.study.service.IClassmateService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


/*
 *
 * @Description 班级服务
 *
 * @author w15104
 * @data: 2019-3-5
 *
 * @modified by:
 * @modified date:
 * @modified no:
 */
@Service
public class ClassmateService implements IClassmateService {

    /**
     * 获取ClassmateMapper
     */
    @Resource
    private ClassmateMapper classmateMapper;

    /**
     *  根据ID查找班级信息
     * @param id 班级ID
     * @return  List<Classmate>
     */
    public  List<Classmate> findClassByID(String id)throws CommonException {
        try {
            return classmateMapper.findClassByID(id);
         }catch (Exception e){
             throw new CommonException(ErrorCode.E_00003, e);
        }
    }
}
