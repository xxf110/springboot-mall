package com.mall.service.impl;

import com.mall.mbg.mapper.PmsBrandMapper;
import com.mall.mbg.model.PmsBrand;
import com.mall.mbg.model.PmsBrandExample;
import com.mall.service.IPmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */

@Service
public class PmsBrandServiceImpl implements IPmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    /**
     * 查询所有的商品品牌
     * @return
     */
    @Override
    public List<PmsBrand> selectAllPmsBrands() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    /**
     * 添加商品品牌
     * @param pmsBrand
     * @return
     */
    @Override
    public int insertPmsBrand(PmsBrand pmsBrand) {
        return pmsBrandMapper.insert(pmsBrand);
    }
}
