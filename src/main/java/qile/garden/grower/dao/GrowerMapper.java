package qile.garden.grower.dao;

import qile.garden.grower.entity.Grower;

public interface GrowerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grower
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grower
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int insert(Grower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grower
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int insertSelective(Grower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grower
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    Grower selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grower
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int updateByPrimaryKeySelective(Grower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grower
     *
     * @mbg.generated Thu Jun 07 06:46:14 CST 2018
     */
    int updateByPrimaryKey(Grower record);
}