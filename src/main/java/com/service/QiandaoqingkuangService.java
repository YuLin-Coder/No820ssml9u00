package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiandaoqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiandaoqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiandaoqingkuangView;


/**
 * 签到情况
 *
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface QiandaoqingkuangService extends IService<QiandaoqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiandaoqingkuangVO> selectListVO(Wrapper<QiandaoqingkuangEntity> wrapper);
   	
   	QiandaoqingkuangVO selectVO(@Param("ew") Wrapper<QiandaoqingkuangEntity> wrapper);
   	
   	List<QiandaoqingkuangView> selectListView(Wrapper<QiandaoqingkuangEntity> wrapper);
   	
   	QiandaoqingkuangView selectView(@Param("ew") Wrapper<QiandaoqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiandaoqingkuangEntity> wrapper);
   	
}

