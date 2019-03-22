package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.mapper.ProductMapper;
import com.atguigu.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */
@Component
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    //分页查询
    @Override
    public Map<String, Object> pageProduct(Integer pageNum, Integer pageSize) {
        ProductMapper baseMapper = getBaseMapper();
        Page<Product> productPage = new Page<>(pageNum,pageSize);

        IPage<Product> selectPage = baseMapper.selectPage(productPage, null);

        HashMap<String, Object> map = new HashMap<>();
        map.put("PageSize",pageSize);
        map.put("totalPage",selectPage.getPages());
        map.put("total",selectPage.getTotal());
        map.put("pageNum",pageNum);
        map.put("list",selectPage.getRecords());
        return map;
    }
}
