package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.MemberLevel;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 会员等级表 服务类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */

public interface MemberLevelService extends IService<MemberLevel> {

    List<MemberLevel> getMemberLevelByStatus(Integer defaultStatus);
}
