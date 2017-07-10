package com.kingfish.show.mybatis.dao;

import com.kingfish.show.mybatis.model.Feature;
import com.kingfish.show.mybatis.model.FeatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface FeatureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    long countByExample(FeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    int deleteByExample(FeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    @Delete({
        "delete from feature",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    @Insert({
        "insert into feature (id, content)",
        "values (#{id,jdbcType=INTEGER}, #{content,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=true, resultType=Integer.class)
    int insert(Feature record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    int insertSelective(Feature record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    List<Feature> selectByExample(FeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, content",
        "from feature",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.kingfish.show.mybatis.dao.FeatureMapper.BaseResultMap")
    Feature selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Feature record, @Param("example") FeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Feature record, @Param("example") FeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Feature record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feature
     *
     * @mbg.generated
     */
    @Update({
        "update feature",
        "set content = #{content,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Feature record);
}