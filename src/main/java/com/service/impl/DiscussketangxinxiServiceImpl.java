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


import com.dao.DiscussketangxinxiDao;
import com.entity.DiscussketangxinxiEntity;
import com.service.DiscussketangxinxiService;
import com.entity.vo.DiscussketangxinxiVO;
import com.entity.view.DiscussketangxinxiView;

@Service("discussketangxinxiService")
public class DiscussketangxinxiServiceImpl extends ServiceImpl<DiscussketangxinxiDao, DiscussketangxinxiEntity> implements DiscussketangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussketangxinxiEntity> page = this.selectPage(
                new Query<DiscussketangxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussketangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussketangxinxiEntity> wrapper) {
		  Page<DiscussketangxinxiView> page =new Query<DiscussketangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussketangxinxiVO> selectListVO(Wrapper<DiscussketangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussketangxinxiVO selectVO(Wrapper<DiscussketangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussketangxinxiView> selectListView(Wrapper<DiscussketangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussketangxinxiView selectView(Wrapper<DiscussketangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
