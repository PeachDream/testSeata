package com.peach.springcloud.mapper;

import com.peach.springcloud.entity.TStorage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TStorageMapper {


    @Update("UPDATE t_storage SET used = used + #{number} ,residue = residue - #{number} where id = #{id}")
    int reduceStorage(@Param("id")Long id,@Param("number") Integer number);

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