package com.kingfish.show.mybatis.model;

import java.util.Date;

public class Msg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg.gmt_modify
     *
     * @mbg.generated
     */
    private Date gmtModify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg.show_id
     *
     * @mbg.generated
     */
    private Long showId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg.user_ip
     *
     * @mbg.generated
     */
    private String userIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg.product_id
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg.product_key_id
     *
     * @mbg.generated
     */
    private Long productKeyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg.id
     *
     * @return the value of msg.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg.id
     *
     * @param id the value for msg.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg.gmt_create
     *
     * @return the value of msg.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg.gmt_create
     *
     * @param gmtCreate the value for msg.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg.gmt_modify
     *
     * @return the value of msg.gmt_modify
     *
     * @mbg.generated
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg.gmt_modify
     *
     * @param gmtModify the value for msg.gmt_modify
     *
     * @mbg.generated
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg.show_id
     *
     * @return the value of msg.show_id
     *
     * @mbg.generated
     */
    public Long getShowId() {
        return showId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg.show_id
     *
     * @param showId the value for msg.show_id
     *
     * @mbg.generated
     */
    public void setShowId(Long showId) {
        this.showId = showId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg.user_id
     *
     * @return the value of msg.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg.user_id
     *
     * @param userId the value for msg.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg.user_ip
     *
     * @return the value of msg.user_ip
     *
     * @mbg.generated
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg.user_ip
     *
     * @param userIp the value for msg.user_ip
     *
     * @mbg.generated
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg.content
     *
     * @return the value of msg.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg.content
     *
     * @param content the value for msg.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg.product_id
     *
     * @return the value of msg.product_id
     *
     * @mbg.generated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg.product_id
     *
     * @param productId the value for msg.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg.product_key_id
     *
     * @return the value of msg.product_key_id
     *
     * @mbg.generated
     */
    public Long getProductKeyId() {
        return productKeyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg.product_key_id
     *
     * @param productKeyId the value for msg.product_key_id
     *
     * @mbg.generated
     */
    public void setProductKeyId(Long productKeyId) {
        this.productKeyId = productKeyId;
    }
}