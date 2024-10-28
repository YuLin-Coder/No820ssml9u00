package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetangjiaruEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetangjiaruVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetangjiaruView;


/**
 * 课堂加入
 *
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface KetangjiaruService extends IService<KetangjiaruEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetangjiaruVO> selectListVO(Wrapper<KetangjiaruEntity> wrapper);
   	
   	KetangjiaruVO selectVO(@Param("ew") Wrapper<KetangjiaruEntity> wrapper);
   	
   	List<KetangjiaruView> selectListView(Wrapper<KetangjiaruEntity> wrapper);
   	
   	KetangjiaruView selectView(@Param("ew") Wrapper<KetangjiaruEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetangjiaruEntity> wrapper);
   	
}

