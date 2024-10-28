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


import com.dao.DiscussqiandaoxinxiDao;
import com.entity.DiscussqiandaoxinxiEntity;
import com.service.DiscussqiandaoxinxiService;
import com.entity.vo.DiscussqiandaoxinxiVO;
import com.entity.view.DiscussqiandaoxinxiView;

@Service("discussqiandaoxinxiService")
public class DiscussqiandaoxinxiServiceImpl extends ServiceImpl<DiscussqiandaoxinxiDao, DiscussqiandaoxinxiEntity> implements DiscussqiandaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiandaoxinxiEntity> page = this.selectPage(
                new Query<DiscussqiandaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussqiandaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiandaoxinxiEntity> wrapper) {
		  Page<DiscussqiandaoxinxiView> page =new Query<DiscussqiandaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiandaoxinxiVO> selectListVO(Wrapper<DiscussqiandaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiandaoxinxiVO selectVO(Wrapper<DiscussqiandaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiandaoxinxiView> selectListView(Wrapper<DiscussqiandaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiandaoxinxiView selectView(Wrapper<DiscussqiandaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
