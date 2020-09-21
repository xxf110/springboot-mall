package com.mall.service.impl;

import com.github.pagehelper.PageHelper;
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

    /**
     * 根据指定id删除商品品牌
     * @param id
     * @return
     */
    @Override
    public int deletePmsBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据id查询商品品牌信息
     * @param id
     * @return
     */
    @Override
    public PmsBrand findById(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改商品信息
     * @param pmsBrand
     * @return
     */
    @Override
    public int updateBrand(PmsBrand pmsBrand) {
        return pmsBrandMapper.updateByPrimaryKey(pmsBrand);
    }

    /**
     * 分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsBrand> listPageByBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }
}
