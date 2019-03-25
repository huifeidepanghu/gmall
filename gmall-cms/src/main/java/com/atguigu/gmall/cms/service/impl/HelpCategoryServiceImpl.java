package com.atguigu.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.cms.entity.HelpCategory;
import com.atguigu.gmall.cms.mapper.HelpCategoryMapper;
import com.atguigu.gmall.cms.service.HelpCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;


/**
 * <p>
 * 帮助分类表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */
@Component
@Service
public class HelpCategoryServiceImpl extends ServiceImpl<HelpCategoryMapper, HelpCategory> implements HelpCategoryService {

}
