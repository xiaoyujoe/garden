package qile.garden.fresh.dao;

import qile.garden.fresh.entity.Fresh;

public interface FreshMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fresh
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fresh
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int insert(Fresh record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fresh
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int insertSelective(Fresh record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fresh
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    Fresh selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fresh
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int updateByPrimaryKeySelective(Fresh record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fresh
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int updateByPrimaryKey(Fresh record);
}