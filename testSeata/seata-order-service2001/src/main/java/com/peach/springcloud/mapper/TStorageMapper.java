package com.peach.springcloud.mapper;

import com.peach.springcloud.entity.TStorage;

public interface TStorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_storage
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_storage
     *
     * @mbg.generated
     */
    int insert(TStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_storage
     *
     * @mbg.generated
     */
    int insertSelective(TStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_storage
     *
     * @mbg.generated
     */
    TStorage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_storage
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_storage
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TStorage record);
}