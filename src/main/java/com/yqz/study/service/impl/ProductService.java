package com.yqz.study.service.impl;

import com.github.pagehelper.PageHelper;
import com.yqz.study.basic.exception.CommonException;
import com.yqz.study.basic.exception.ErrorCode;
import com.yqz.study.entity.Product;
import com.yqz.study.mapper.ProductMapper;
import com.yqz.study.service.IProductService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 *
 * @Description 商品业务服务类
 *
 * @author w15104
 * @data: 2019-3-5
 *
 * @modified by:
 * @modified date:
 * @modified no:
 */
@Service
public class ProductService implements IProductService {

    //获取商品mapper类
    @Resource
    private ProductMapper productMapper;


    /**
     * 添加商品信息
     * @param product 商品实体
     */
    public void add(Product product)  {

        int result;

        try {
            result = productMapper.saveOrUpdate(product);
        }catch (Exception e){
            throw new CommonException(ErrorCode.E_00001, e);
        }

        if(result == 0){
            throw new CommonException(ErrorCode.E_00001);
        }
    }

    /**
     * g更新商品信息
     * @param product 商品实体
     */
    public void updateByID(Product product) throws CommonException {

        try {
              productMapper.updateByID(product);
        }catch (Exception e){
            throw new CommonException(ErrorCode.E_00004, e);
        }

    }

    /**
     * 根据ID删除商品
     * @param id 商品ID
     */
    public void deleteById(Integer id)throws CommonException {

        int result;

        try {
             result = productMapper.deleteById(id);
        }catch (Exception e){
            throw new CommonException(ErrorCode.E_00002, e);
        }

        if(result == 0){
            throw new CommonException(ErrorCode.E_00007);
        }
    }

    /**
     * 根基ID查找商品
     * @param id 商品ID
     * @return Product
     */
    public Product getById(Integer id)throws CommonException {
        try {
            return productMapper.getById(id);
        }catch (Exception e){
            throw new CommonException(ErrorCode.E_00003, e);
        }

    }

    /**
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper,很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * @param pageNo 开始页数
     * @param pageSize 每页显示的数据条数
    */
    public List<Product> getListWithPage(Integer pageNo,Integer pageSize) throws CommonException {

        //将参数传给这个方法就可以实现物理分页了，非常简单。
        try {
            if(pageNo!=null && pageSize!=null){
                PageHelper.startPage(pageNo, pageSize);
            }
            return productMapper.getAll();
        }catch (Exception e){
            throw new CommonException(ErrorCode.E_00003, e);
        }
    }
}
