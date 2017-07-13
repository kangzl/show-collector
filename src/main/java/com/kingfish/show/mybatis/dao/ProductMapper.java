package com.kingfish.show.mybatis.dao;

import com.kingfish.show.mybatis.model.Product;
import com.kingfish.show.mybatis.model.ProductExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @SelectProvider(type=ProductSqlProvider.class, method="countByExample")
    long countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @DeleteProvider(type=ProductSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @Delete({
        "delete from product",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @Insert({
        "insert into product (product_id, gmt_create, ",
        "gmt_modify, detail_url, ",
        "is_p4p, p4p_url, cate_id, ",
        "view_sales, sale_id, ",
        "l1_category, source, ",
        "pic_url, shop_url, ",
        "similar_url, title, ",
        "keyword)",
        "values (#{productId,jdbcType=BIGINT}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP}, #{detailUrl,jdbcType=VARCHAR}, ",
        "#{isP4p,jdbcType=BIT}, #{p4pUrl,jdbcType=VARCHAR}, #{cateId,jdbcType=BIGINT}, ",
        "#{viewSales,jdbcType=VARCHAR}, #{saleId,jdbcType=BIGINT}, ",
        "#{l1Category,jdbcType=BIGINT}, #{source,jdbcType=TINYINT}, ",
        "#{picUrl,jdbcType=VARCHAR}, #{shopUrl,jdbcType=VARCHAR}, ",
        "#{similarUrl,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, ",
        "#{keyword,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @InsertProvider(type=ProductSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @SelectProvider(type=ProductSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="detail_url", property="detailUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_p4p", property="isP4p", jdbcType=JdbcType.BIT),
        @Result(column="p4p_url", property="p4pUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="cate_id", property="cateId", jdbcType=JdbcType.BIGINT),
        @Result(column="view_sales", property="viewSales", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_id", property="saleId", jdbcType=JdbcType.BIGINT),
        @Result(column="l1_category", property="l1Category", jdbcType=JdbcType.BIGINT),
        @Result(column="source", property="source", jdbcType=JdbcType.TINYINT),
        @Result(column="pic_url", property="picUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_url", property="shopUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="similar_url", property="similarUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR)
    })
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, product_id, gmt_create, gmt_modify, detail_url, is_p4p, p4p_url, cate_id, ",
        "view_sales, sale_id, l1_category, source, pic_url, shop_url, similar_url, title, ",
        "keyword",
        "from product",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="detail_url", property="detailUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_p4p", property="isP4p", jdbcType=JdbcType.BIT),
        @Result(column="p4p_url", property="p4pUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="cate_id", property="cateId", jdbcType=JdbcType.BIGINT),
        @Result(column="view_sales", property="viewSales", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_id", property="saleId", jdbcType=JdbcType.BIGINT),
        @Result(column="l1_category", property="l1Category", jdbcType=JdbcType.BIGINT),
        @Result(column="source", property="source", jdbcType=JdbcType.TINYINT),
        @Result(column="pic_url", property="picUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_url", property="shopUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="similar_url", property="similarUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR)
    })
    Product selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    @Update({
        "update product",
        "set product_id = #{productId,jdbcType=BIGINT},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "detail_url = #{detailUrl,jdbcType=VARCHAR},",
          "is_p4p = #{isP4p,jdbcType=BIT},",
          "p4p_url = #{p4pUrl,jdbcType=VARCHAR},",
          "cate_id = #{cateId,jdbcType=BIGINT},",
          "view_sales = #{viewSales,jdbcType=VARCHAR},",
          "sale_id = #{saleId,jdbcType=BIGINT},",
          "l1_category = #{l1Category,jdbcType=BIGINT},",
          "source = #{source,jdbcType=TINYINT},",
          "pic_url = #{picUrl,jdbcType=VARCHAR},",
          "shop_url = #{shopUrl,jdbcType=VARCHAR},",
          "similar_url = #{similarUrl,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "keyword = #{keyword,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Product record);
}