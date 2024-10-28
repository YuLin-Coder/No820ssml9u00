package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetangxinxiView;


/**
 * 课堂信息
 *
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
public interface KetangxinxiService extends IService<KetangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetangxinxiVO> selectListVO(Wrapper<KetangxinxiEntity> wrapper);
   	
   	KetangxinxiVO selectVO(@Param("ew") Wrapper<KetangxinxiEntity> wrapper);
   	
   	List<KetangxinxiView> selectListView(Wrapper<KetangxinxiEntity> wrapper);
   	
   	KetangxinxiView selectView(@Param("ew") Wrapper<KetangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetangxinxiEntity> wrapper);
   	
}

