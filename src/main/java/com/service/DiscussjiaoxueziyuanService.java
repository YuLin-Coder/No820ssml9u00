package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaoxueziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaoxueziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaoxueziyuanView;


/**
 * 教学资源评论表
 *
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface DiscussjiaoxueziyuanService extends IService<DiscussjiaoxueziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaoxueziyuanVO> selectListVO(Wrapper<DiscussjiaoxueziyuanEntity> wrapper);
   	
   	DiscussjiaoxueziyuanVO selectVO(@Param("ew") Wrapper<DiscussjiaoxueziyuanEntity> wrapper);
   	
   	List<DiscussjiaoxueziyuanView> selectListView(Wrapper<DiscussjiaoxueziyuanEntity> wrapper);
   	
   	DiscussjiaoxueziyuanView selectView(@Param("ew") Wrapper<DiscussjiaoxueziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaoxueziyuanEntity> wrapper);
   	
}

