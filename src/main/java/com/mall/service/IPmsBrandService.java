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
}
