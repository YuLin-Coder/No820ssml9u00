package com.dao;

import com.entity.DiscussjiaoxueziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiaoxueziyuanVO;
import com.entity.view.DiscussjiaoxueziyuanView;


/**
 * 教学资源评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface DiscussjiaoxueziyuanDao extends BaseMapper<DiscussjiaoxueziyuanEntity> {
	
	List<DiscussjiaoxueziyuanVO> selectListVO(@Param("ew") Wrapper<DiscussjiaoxueziyuanEntity> wrapper);
	
	DiscussjiaoxueziyuanVO selectVO(@Param("ew") Wrapper<DiscussjiaoxueziyuanEntity> wrapper);
	
	List<DiscussjiaoxueziyuanView> selectListView(@Param("ew") Wrapper<DiscussjiaoxueziyuanEntity> wrapper);

	List<DiscussjiaoxueziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaoxueziyuanEntity> wrapper);
	
	DiscussjiaoxueziyuanView selectView(@Param("ew") Wrapper<DiscussjiaoxueziyuanEntity> wrapper);
	
}
