package qile.garden.field.dao;

import qile.garden.field.entity.Field;

public interface FieldMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table field
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table field
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int insert(Field record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table field
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int insertSelective(Field record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table field
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    Field selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table field
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int updateByPrimaryKeySelective(Field record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table field
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int updateByPrimaryKey(Field record);
}