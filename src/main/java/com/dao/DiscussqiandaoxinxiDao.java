package com.dao;

import com.entity.DiscussqiandaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiandaoxinxiVO;
import com.entity.view.DiscussqiandaoxinxiView;


/**
 * 签到信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface DiscussqiandaoxinxiDao extends BaseMapper<DiscussqiandaoxinxiEntity> {
	
	List<DiscussqiandaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussqiandaoxinxiEntity> wrapper);
	
	DiscussqiandaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiandaoxinxiEntity> wrapper);
	
	List<DiscussqiandaoxinxiView> selectListView(@Param("ew") Wrapper<DiscussqiandaoxinxiEntity> wrapper);

	List<DiscussqiandaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiandaoxinxiEntity> wrapper);
	
	DiscussqiandaoxinxiView selectView(@Param("ew") Wrapper<DiscussqiandaoxinxiEntity> wrapper);
	
}
