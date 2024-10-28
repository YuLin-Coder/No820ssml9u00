package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussketangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussketangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussketangxinxiView;


/**
 * 课堂信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface DiscussketangxinxiService extends IService<DiscussketangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussketangxinxiVO> selectListVO(Wrapper<DiscussketangxinxiEntity> wrapper);
   	
   	DiscussketangxinxiVO selectVO(@Param("ew") Wrapper<DiscussketangxinxiEntity> wrapper);
   	
   	List<DiscussketangxinxiView> selectListView(Wrapper<DiscussketangxinxiEntity> wrapper);
   	
   	DiscussketangxinxiView selectView(@Param("ew") Wrapper<DiscussketangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussketangxinxiEntity> wrapper);
   	
}

