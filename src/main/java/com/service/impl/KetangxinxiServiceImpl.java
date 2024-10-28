package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KetangxinxiDao;
import com.entity.KetangxinxiEntity;
import com.service.KetangxinxiService;
import com.entity.vo.KetangxinxiVO;
import com.entity.view.KetangxinxiView;

@Service("ketangxinxiService")
public class KetangxinxiServiceImpl extends ServiceImpl<KetangxinxiDao, KetangxinxiEntity> implements KetangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetangxinxiEntity> page = this.selectPage(
                new Query<KetangxinxiEntity>(params).getPage(),
                new EntityWrapper<KetangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetangxinxiEntity> wrapper) {
		  Page<KetangxinxiView> page =new Query<KetangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetangxinxiVO> selectListVO(Wrapper<KetangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetangxinxiVO selectVO(Wrapper<KetangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetangxinxiView> selectListView(Wrapper<KetangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetangxinxiView selectView(Wrapper<KetangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
