package com.kingfish.show.mybatis.dao;

import com.kingfish.show.mybatis.model.Shows;
import com.kingfish.show.mybatis.model.ShowsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ShowsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @SelectProvider(type=ShowsSqlProvider.class, method="countByExample")
    long countByExample(ShowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @DeleteProvider(type=ShowsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @Delete({
        "delete from shows",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @Insert({
        "insert into shows (gmt_create, gmt_modify, ",
        "content, truth, praise, ",
        "product_id, pics, ",
        "show_time, is_outside, ",
        "outside_user_head_pic, outside_user_nickname)",
        "values (#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModify,jdbcType=TIMESTAMP}, ",
        "#{content,jdbcType=VARCHAR}, #{truth,jdbcType=DOUBLE}, #{praise,jdbcType=INTEGER}, ",
        "#{productId,jdbcType=BIGINT}, #{pics,jdbcType=VARCHAR}, ",
        "#{showTime,jdbcType=TIMESTAMP}, #{isOutside,jdbcType=BIT}, ",
        "#{outsideUserHeadPic,jdbcType=VARCHAR}, #{outsideUserNickname,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(Shows record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @InsertProvider(type=ShowsSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(Shows record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @SelectProvider(type=ShowsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="truth", property="truth", jdbcType=JdbcType.DOUBLE),
        @Result(column="praise", property="praise", jdbcType=JdbcType.INTEGER),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="pics", property="pics", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_time", property="showTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_outside", property="isOutside", jdbcType=JdbcType.BIT),
        @Result(column="outside_user_head_pic", property="outsideUserHeadPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="outside_user_nickname", property="outsideUserNickname", jdbcType=JdbcType.VARCHAR)
    })
    List<Shows> selectByExample(ShowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, gmt_create, gmt_modify, content, truth, praise, product_id, pics, show_time, ",
        "is_outside, outside_user_head_pic, outside_user_nickname",
        "from shows",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="truth", property="truth", jdbcType=JdbcType.DOUBLE),
        @Result(column="praise", property="praise", jdbcType=JdbcType.INTEGER),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="pics", property="pics", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_time", property="showTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_outside", property="isOutside", jdbcType=JdbcType.BIT),
        @Result(column="outside_user_head_pic", property="outsideUserHeadPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="outside_user_nickname", property="outsideUserNickname", jdbcType=JdbcType.VARCHAR)
    })
    Shows selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ShowsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Shows record, @Param("example") ShowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ShowsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Shows record, @Param("example") ShowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ShowsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Shows record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shows
     *
     * @mbg.generated
     */
    @Update({
        "update shows",
        "set gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "content = #{content,jdbcType=VARCHAR},",
          "truth = #{truth,jdbcType=DOUBLE},",
          "praise = #{praise,jdbcType=INTEGER},",
          "product_id = #{productId,jdbcType=BIGINT},",
          "pics = #{pics,jdbcType=VARCHAR},",
          "show_time = #{showTime,jdbcType=TIMESTAMP},",
          "is_outside = #{isOutside,jdbcType=BIT},",
          "outside_user_head_pic = #{outsideUserHeadPic,jdbcType=VARCHAR},",
          "outside_user_nickname = #{outsideUserNickname,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Shows record);
}