package com.dao;

import com.entity.KetangjiaruEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetangjiaruVO;
import com.entity.view.KetangjiaruView;


/**
 * 课堂加入
 * 
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface KetangjiaruDao extends BaseMapper<KetangjiaruEntity> {
	
	List<KetangjiaruVO> selectListVO(@Param("ew") Wrapper<KetangjiaruEntity> wrapper);
	
	KetangjiaruVO selectVO(@Param("ew") Wrapper<KetangjiaruEntity> wrapper);
	
	List<KetangjiaruView> selectListView(@Param("ew") Wrapper<KetangjiaruEntity> wrapper);

	List<KetangjiaruView> selectListView(Pagination page,@Param("ew") Wrapper<KetangjiaruEntity> wrapper);
	
	KetangjiaruView selectView(@Param("ew") Wrapper<KetangjiaruEntity> wrapper);
	
}
