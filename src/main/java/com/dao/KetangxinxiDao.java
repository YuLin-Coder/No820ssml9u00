package com.dao;

import com.entity.KetangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetangxinxiVO;
import com.entity.view.KetangxinxiView;


/**
 * 课堂信息
 * 
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface KetangxinxiDao extends BaseMapper<KetangxinxiEntity> {
	
	List<KetangxinxiVO> selectListVO(@Param("ew") Wrapper<KetangxinxiEntity> wrapper);
	
	KetangxinxiVO selectVO(@Param("ew") Wrapper<KetangxinxiEntity> wrapper);
	
	List<KetangxinxiView> selectListView(@Param("ew") Wrapper<KetangxinxiEntity> wrapper);

	List<KetangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KetangxinxiEntity> wrapper);
	
	KetangxinxiView selectView(@Param("ew") Wrapper<KetangxinxiEntity> wrapper);
	
}
