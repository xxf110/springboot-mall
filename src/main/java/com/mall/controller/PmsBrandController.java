package com.mall.controller;

import com.mall.common.CommonPage;
import com.mall.common.CommonResult;
import com.mall.mbg.model.PmsBrand;
import com.mall.service.IPmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Administrator
 */
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@RestController
@RequestMapping("/pmsBrand")
public class PmsBrandController {

    /**
     * 开启日志
     */
    private static final Logger LOGGER =
            LoggerFactory.getLogger(PmsBrandController.class);

    @Autowired
    private IPmsBrandService iPmsBrandService;

    /**
     * 查询所有的品牌
     * @return
     */
    @ApiOperation("获取所有商品品牌信息")
    @PostMapping("/selectAllBrand")
    public CommonResult<List<PmsBrand>> selectAllBrand(){
        return CommonResult.success(iPmsBrandService.selectAllPmsBrands());
    }

    /**
     * 添加商品品牌
     */
    @ApiOperation("添加品牌信息")
    @PostMapping("/addBrand")
    public CommonResult addBrand(@RequestBody PmsBrand pmsBrand){
        int addBrand = iPmsBrandService.insertPmsBrand(pmsBrand);
        CommonResult commonResult;
        if (addBrand == 1){
            commonResult = CommonResult.success(pmsBrand);
            LOGGER.debug("addBrand is success", pmsBrand);
        } else {
            commonResult = CommonResult.failed();
            LOGGER.debug("addBrand is failed", pmsBrand);
        }
        return commonResult;
    }

    /**
     * 根据指定id删除商品品牌
     * @param id
     * @return
     */
    @ApiOperation("删除指定id的品牌")
    @DeleteMapping("/deleteBrandById")
    public CommonResult deleteBrand(Long id){
        int i = iPmsBrandService.deletePmsBrand(id);
        CommonResult commonResult;
        if (i == 1) {
            commonResult = CommonResult.success(id);
            LOGGER.debug("deleteBrand is success", id);
        } else {
            commonResult = CommonResult.failed();
            LOGGER.debug("deleteBrand is failed", id);
        }
        return commonResult;
    }

    /**
     * 根据id查询品牌信息
     * @param id
     * @return
     */
    @ApiOperation("获取指定id的品牌详情")
    @GetMapping("/findById")
    public CommonResult findById(Long id) {
        PmsBrand byId = iPmsBrandService.findById(id);
        return CommonResult.success(byId);
    }

    /**
     * 修改商品信息
     * @param pmsBrand
     * @return
     */
    @ApiOperation("修改指定id的商品信息")
    @PostMapping("/updateBrand")
    public CommonResult updateBrand(@RequestBody PmsBrand pmsBrand) {
        int i = iPmsBrandService.updateBrand(pmsBrand);
        CommonResult commonResult;
        if (i == 1){
            commonResult = CommonResult.success(pmsBrand);
            LOGGER.debug("updateBrand is success", pmsBrand);
        } else {
            commonResult = CommonResult.failed();
            LOGGER.debug("updateBrand is failed", pmsBrand);
        }
        return commonResult;
    }

    /**
     * 分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("分页")
    @GetMapping("/listPage")
    public CommonResult listPageByBrand(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                        @RequestParam(value = "pageSize", defaultValue = "3") int pageSize){
        List<PmsBrand> pmsBrands = iPmsBrandService.listPageByBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.resultPage(pmsBrands));
    }

}
