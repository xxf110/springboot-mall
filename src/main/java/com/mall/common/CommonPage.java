package com.mall.common;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author Administrator
 *      通用分页
 */
public class CommonPage<T> {

    private int pageNum;
    private int pageSize;
    private int totalPage;
    private long total;
    private List<T> data;

    public static <T> CommonPage<T> resultPage(List<T> data){
        CommonPage<T> commonPage = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<>(data);
        commonPage.setTotalPage(pageInfo.getPages());
        commonPage.setPageNum(pageInfo.getPageNum());
        commonPage.setPageSize(pageInfo.getPageSize());
        commonPage.setTotal(pageInfo.getTotal());
        commonPage.setData(pageInfo.getList());
        return commonPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
