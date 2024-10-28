package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiandaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiandaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiandaoxinxiView;


/**
 * 签到信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface DiscussqiandaoxinxiService extends IService<DiscussqiandaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiandaoxinxiVO> selectListVO(Wrapper<DiscussqiandaoxinxiEntity> wrapper);
   	
   	DiscussqiandaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiandaoxinxiEntity> wrapper);
   	
   	List<DiscussqiandaoxinxiView> selectListView(Wrapper<DiscussqiandaoxinxiEntity> wrapper);
   	
   	DiscussqiandaoxinxiView selectView(@Param("ew") Wrapper<DiscussqiandaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiandaoxinxiEntity> wrapper);
   	
}

