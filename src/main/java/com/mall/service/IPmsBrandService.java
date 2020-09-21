package com.mall.service;

import com.mall.mbg.model.PmsBrand;

import java.util.List;

public interface IPmsBrandService {

    /**
     * 查询所有的商品品牌
     * @return
     */
    List<PmsBrand> selectAllPmsBrands();

    /**
     * 添加商品品牌
     * @param pmsBrand
     * @return
     */
    int insertPmsBrand(PmsBrand pmsBrand);

    /**
     * 根据指定id删除商品品牌
     * @param id
     * @return
     */
    int deletePmsBrand(Long id);

    /**
     * 根据id查找商品品牌信息
     * @param id
     * @return
     */
    PmsBrand findById(Long id);

    /**
     * 修改商品信息
     * @param pmsBrand
     * @return
     */
    int updateBrand(PmsBrand pmsBrand);

    /**
     * 分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsBrand> listPageByBrand(int pageNum, int pageSize);
}
