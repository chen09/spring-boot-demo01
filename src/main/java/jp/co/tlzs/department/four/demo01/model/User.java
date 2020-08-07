package jp.co.tlzs.department.four.demo01.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    private Boolean age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.use_flg
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    private Byte useFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.del_flg
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    private Byte delFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.created_at
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.updated_at
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.created_user_id
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    private Integer createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.updated_user_id
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    private Integer updatedUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public Boolean getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public void setAge(Boolean age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.use_flg
     *
     * @return the value of user.use_flg
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public Byte getUseFlg() {
        return useFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.use_flg
     *
     * @param useFlg the value for user.use_flg
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public void setUseFlg(Byte useFlg) {
        this.useFlg = useFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.del_flg
     *
     * @return the value of user.del_flg
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public Byte getDelFlg() {
        return delFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.del_flg
     *
     * @param delFlg the value for user.del_flg
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public void setDelFlg(Byte delFlg) {
        this.delFlg = delFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.created_at
     *
     * @return the value of user.created_at
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.created_at
     *
     * @param createdAt the value for user.created_at
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.updated_at
     *
     * @return the value of user.updated_at
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.updated_at
     *
     * @param updatedAt the value for user.updated_at
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.created_user_id
     *
     * @return the value of user.created_user_id
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public Integer getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.created_user_id
     *
     * @param createdUserId the value for user.created_user_id
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.updated_user_id
     *
     * @return the value of user.updated_user_id
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public Integer getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.updated_user_id
     *
     * @param updatedUserId the value for user.updated_user_id
     *
     * @mbg.generated Thu Aug 06 23:41:47 JST 2020
     */
    public void setUpdatedUserId(Integer updatedUserId) {
        this.updatedUserId = updatedUserId;
    }
}