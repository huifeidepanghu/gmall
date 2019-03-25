package com.atguigu.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.cms.entity.Subject;
import com.atguigu.gmall.cms.mapper.SubjectMapper;
import com.atguigu.gmall.cms.service.SubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * <p>
 * 专题表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */
@Component
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {

    @Override
    public List<Subject> getAllList() {
        SubjectMapper baseMapper = getBaseMapper();
        List<Subject> subjects = baseMapper.selectList(null);
        return subjects;
    }
}
