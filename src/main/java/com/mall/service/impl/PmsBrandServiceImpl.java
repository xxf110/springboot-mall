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

    @Override
    public List<PmsBrand> selectAllPmsBrands() {
        List<PmsBrand> pmsBrands = pmsBrandMapper.selectByExample(new PmsBrandExample());
        return pmsBrands;
    }
}
