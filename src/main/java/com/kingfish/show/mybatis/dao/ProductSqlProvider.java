package com.kingfish.show.mybatis.dao;

import com.kingfish.show.mybatis.model.Product;
import com.kingfish.show.mybatis.model.ProductExample.Criteria;
import com.kingfish.show.mybatis.model.ProductExample.Criterion;
import com.kingfish.show.mybatis.model.ProductExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ProductSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    public String countByExample(ProductExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("product");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    public String deleteByExample(ProductExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("product");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    public String insertSelective(Product record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("product");
        
        if (record.getProductId() != null) {
            sql.VALUES("product_id", "#{productId,jdbcType=BIGINT}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.VALUES("gmt_create", "#{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.VALUES("gmt_modify", "#{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDetailUrl() != null) {
            sql.VALUES("detail_url", "#{detailUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getIsP4p() != null) {
            sql.VALUES("is_p4p", "#{isP4p,jdbcType=BIT}");
        }
        
        if (record.getP4pUrl() != null) {
            sql.VALUES("p4p_url", "#{p4pUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCateId() != null) {
            sql.VALUES("cate_id", "#{cateId,jdbcType=BIGINT}");
        }
        
        if (record.getViewSales() != null) {
            sql.VALUES("view_sales", "#{viewSales,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleId() != null) {
            sql.VALUES("sale_id", "#{saleId,jdbcType=BIGINT}");
        }
        
        if (record.getL1Category() != null) {
            sql.VALUES("l1_category", "#{l1Category,jdbcType=BIGINT}");
        }
        
        if (record.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=TINYINT}");
        }
        
        if (record.getPicUrl() != null) {
            sql.VALUES("pic_url", "#{picUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getShopUrl() != null) {
            sql.VALUES("shop_url", "#{shopUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getSimilarUrl() != null) {
            sql.VALUES("similar_url", "#{similarUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getKeyword() != null) {
            sql.VALUES("keyword", "#{keyword,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    public String selectByExample(ProductExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("product_id");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modify");
        sql.SELECT("detail_url");
        sql.SELECT("is_p4p");
        sql.SELECT("p4p_url");
        sql.SELECT("cate_id");
        sql.SELECT("view_sales");
        sql.SELECT("sale_id");
        sql.SELECT("l1_category");
        sql.SELECT("source");
        sql.SELECT("pic_url");
        sql.SELECT("shop_url");
        sql.SELECT("similar_url");
        sql.SELECT("title");
        sql.SELECT("keyword");
        sql.FROM("product");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Product record = (Product) parameter.get("record");
        ProductExample example = (ProductExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("product");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getProductId() != null) {
            sql.SET("product_id = #{record.productId,jdbcType=BIGINT}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDetailUrl() != null) {
            sql.SET("detail_url = #{record.detailUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getIsP4p() != null) {
            sql.SET("is_p4p = #{record.isP4p,jdbcType=BIT}");
        }
        
        if (record.getP4pUrl() != null) {
            sql.SET("p4p_url = #{record.p4pUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCateId() != null) {
            sql.SET("cate_id = #{record.cateId,jdbcType=BIGINT}");
        }
        
        if (record.getViewSales() != null) {
            sql.SET("view_sales = #{record.viewSales,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleId() != null) {
            sql.SET("sale_id = #{record.saleId,jdbcType=BIGINT}");
        }
        
        if (record.getL1Category() != null) {
            sql.SET("l1_category = #{record.l1Category,jdbcType=BIGINT}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{record.source,jdbcType=TINYINT}");
        }
        
        if (record.getPicUrl() != null) {
            sql.SET("pic_url = #{record.picUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getShopUrl() != null) {
            sql.SET("shop_url = #{record.shopUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getSimilarUrl() != null) {
            sql.SET("similar_url = #{record.similarUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getKeyword() != null) {
            sql.SET("keyword = #{record.keyword,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("product");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("product_id = #{record.productId,jdbcType=BIGINT}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        sql.SET("detail_url = #{record.detailUrl,jdbcType=VARCHAR}");
        sql.SET("is_p4p = #{record.isP4p,jdbcType=BIT}");
        sql.SET("p4p_url = #{record.p4pUrl,jdbcType=VARCHAR}");
        sql.SET("cate_id = #{record.cateId,jdbcType=BIGINT}");
        sql.SET("view_sales = #{record.viewSales,jdbcType=VARCHAR}");
        sql.SET("sale_id = #{record.saleId,jdbcType=BIGINT}");
        sql.SET("l1_category = #{record.l1Category,jdbcType=BIGINT}");
        sql.SET("source = #{record.source,jdbcType=TINYINT}");
        sql.SET("pic_url = #{record.picUrl,jdbcType=VARCHAR}");
        sql.SET("shop_url = #{record.shopUrl,jdbcType=VARCHAR}");
        sql.SET("similar_url = #{record.similarUrl,jdbcType=VARCHAR}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("keyword = #{record.keyword,jdbcType=VARCHAR}");
        
        ProductExample example = (ProductExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(Product record) {
        SQL sql = new SQL();
        sql.UPDATE("product");
        
        if (record.getProductId() != null) {
            sql.SET("product_id = #{productId,jdbcType=BIGINT}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDetailUrl() != null) {
            sql.SET("detail_url = #{detailUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getIsP4p() != null) {
            sql.SET("is_p4p = #{isP4p,jdbcType=BIT}");
        }
        
        if (record.getP4pUrl() != null) {
            sql.SET("p4p_url = #{p4pUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCateId() != null) {
            sql.SET("cate_id = #{cateId,jdbcType=BIGINT}");
        }
        
        if (record.getViewSales() != null) {
            sql.SET("view_sales = #{viewSales,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleId() != null) {
            sql.SET("sale_id = #{saleId,jdbcType=BIGINT}");
        }
        
        if (record.getL1Category() != null) {
            sql.SET("l1_category = #{l1Category,jdbcType=BIGINT}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{source,jdbcType=TINYINT}");
        }
        
        if (record.getPicUrl() != null) {
            sql.SET("pic_url = #{picUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getShopUrl() != null) {
            sql.SET("shop_url = #{shopUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getSimilarUrl() != null) {
            sql.SET("similar_url = #{similarUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getKeyword() != null) {
            sql.SET("keyword = #{keyword,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, ProductExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}