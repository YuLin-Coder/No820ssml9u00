package com.dao;

import com.entity.QiandaoqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiandaoqingkuangVO;
import com.entity.view.QiandaoqingkuangView;


/**
 * 签到情况
 * 
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface QiandaoqingkuangDao extends BaseMapper<QiandaoqingkuangEntity> {
	
	List<QiandaoqingkuangVO> selectListVO(@Param("ew") Wrapper<QiandaoqingkuangEntity> wrapper);
	
	QiandaoqingkuangVO selectVO(@Param("ew") Wrapper<QiandaoqingkuangEntity> wrapper);
	
	List<QiandaoqingkuangView> selectListView(@Param("ew") Wrapper<QiandaoqingkuangEntity> wrapper);

	List<QiandaoqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<QiandaoqingkuangEntity> wrapper);
	
	QiandaoqingkuangView selectView(@Param("ew") Wrapper<QiandaoqingkuangEntity> wrapper);
	
}
