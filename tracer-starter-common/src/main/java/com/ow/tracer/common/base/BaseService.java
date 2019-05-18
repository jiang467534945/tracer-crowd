package com.ow.tracer.common.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ow.tracer.common.vo.UserVO;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @auther: Easy
 * @Date: 18-9-6 17:45
 * @Description:通用Service，可以自定义服务
 */
public interface BaseService<T>extends IService <T>{
    boolean save(T var1, UserVO userVO);
    boolean saveBatch(Collection<T> var1,UserVO userVO);
    @Override
    boolean saveOrUpdateBatch(Collection<T> var1);
    @Override
    boolean removeById(Serializable var1);
    @Override
    boolean remove(Wrapper<T> var1);
    @Override
    boolean removeByIds(Collection<? extends Serializable> var1);
    boolean updateById(T var1,UserVO userVO);
    boolean update(T var1, Wrapper<T> var2,UserVO userVO);
    boolean saveOrUpdate(T var1,UserVO userVO);
    @Override
    T getById(Serializable var1);
    @Override
    Collection<T> listByIds(Collection<? extends Serializable> var1);
    @Override
    T getOne(Wrapper<T> var1);
    @Override
    Object getObj(Wrapper<T> var1);
    @Override
    IPage<T> page(IPage<T> var1, Wrapper<T> var2);
    @Override
    List<Object> listObjs(Wrapper<T> var1);

    //这里可以定义通用的service方法
}
