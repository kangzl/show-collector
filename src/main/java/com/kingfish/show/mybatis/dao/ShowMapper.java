package com.kingfish.show.mybatis.dao;

import com.kingfish.show.mybatis.model.Show;
import com.kingfish.show.mybatis.model.ShowExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ShowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    long countByExample(ShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    int deleteByExample(ShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    @Delete({
        "delete from show",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    @Insert({
        "insert into show (id, gmt_create, ",
        "gmt_modify, truth, ",
        "praise, product_id, ",
        "source, pics, show_time)",
        "values (#{id,jdbcType=BIGINT}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP}, #{truth,jdbcType=DOUBLE}, ",
        "#{praise,jdbcType=INTEGER}, #{productId,jdbcType=BIGINT}, ",
        "#{source,jdbcType=TINYINT}, #{pics,jdbcType=VARCHAR}, #{showTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=true, resultType=Long.class)
    int insert(Show record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    int insertSelective(Show record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    List<Show> selectByExample(ShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, gmt_create, gmt_modify, truth, praise, product_id, source, pics, show_time",
        "from show",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.kingfish.show.mybatis.dao.ShowMapper.BaseResultMap")
    Show selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Show record, @Param("example") ShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Show record, @Param("example") ShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Show record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table show
     *
     * @mbg.generated
     */
    @Update({
        "update show",
        "set gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "truth = #{truth,jdbcType=DOUBLE},",
          "praise = #{praise,jdbcType=INTEGER},",
          "product_id = #{productId,jdbcType=BIGINT},",
          "source = #{source,jdbcType=TINYINT},",
          "pics = #{pics,jdbcType=VARCHAR},",
          "show_time = #{showTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Show record);
}