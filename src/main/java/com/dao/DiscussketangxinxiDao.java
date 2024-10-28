package com.dao;

import com.entity.DiscussketangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussketangxinxiVO;
import com.entity.view.DiscussketangxinxiView;


/**
 * 课堂信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface DiscussketangxinxiDao extends BaseMapper<DiscussketangxinxiEntity> {
	
	List<DiscussketangxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussketangxinxiEntity> wrapper);
	
	DiscussketangxinxiVO selectVO(@Param("ew") Wrapper<DiscussketangxinxiEntity> wrapper);
	
	List<DiscussketangxinxiView> selectListView(@Param("ew") Wrapper<DiscussketangxinxiEntity> wrapper);

	List<DiscussketangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussketangxinxiEntity> wrapper);
	
	DiscussketangxinxiView selectView(@Param("ew") Wrapper<DiscussketangxinxiEntity> wrapper);
	
}
