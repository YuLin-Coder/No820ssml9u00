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


import com.dao.DiscussjiaoxueziyuanDao;
import com.entity.DiscussjiaoxueziyuanEntity;
import com.service.DiscussjiaoxueziyuanService;
import com.entity.vo.DiscussjiaoxueziyuanVO;
import com.entity.view.DiscussjiaoxueziyuanView;

@Service("discussjiaoxueziyuanService")
public class DiscussjiaoxueziyuanServiceImpl extends ServiceImpl<DiscussjiaoxueziyuanDao, DiscussjiaoxueziyuanEntity> implements DiscussjiaoxueziyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaoxueziyuanEntity> page = this.selectPage(
                new Query<DiscussjiaoxueziyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaoxueziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaoxueziyuanEntity> wrapper) {
		  Page<DiscussjiaoxueziyuanView> page =new Query<DiscussjiaoxueziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiaoxueziyuanVO> selectListVO(Wrapper<DiscussjiaoxueziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaoxueziyuanVO selectVO(Wrapper<DiscussjiaoxueziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaoxueziyuanView> selectListView(Wrapper<DiscussjiaoxueziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaoxueziyuanView selectView(Wrapper<DiscussjiaoxueziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
