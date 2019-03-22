package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.mapper.BrandMapper;
import com.atguigu.gmall.pms.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */
@Component
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Override
    public Map<String, Object> pageBrand(String keyword, Integer pageNum, Integer pageSize) {
        BrandMapper baseMapper = getBaseMapper();

        QueryWrapper<Brand> eq = null;
        if (!StringUtils.isEmpty(keyword)){
             eq = new QueryWrapper<Brand>().like("name", keyword).eq("first_letter", keyword);
        }

        IPage<Brand> selectPage = baseMapper.selectPage(new Page<Brand>(pageNum, pageSize), eq);
        HashMap<String, Object> map = new HashMap<>();
        map.put("PageSize",pageSize);
        map.put("totalPage",selectPage.getPages());
        map.put("total",selectPage.getTotal());
        map.put("pageNum",pageNum);
        map.put("list",selectPage.getRecords());

        return map;
    }

    @Override
    public Brand deleteById(Long id) {

        int deleteById = baseMapper.deleteById(id);

        return null;
    }
}
