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


import com.dao.KetangjiaruDao;
import com.entity.KetangjiaruEntity;
import com.service.KetangjiaruService;
import com.entity.vo.KetangjiaruVO;
import com.entity.view.KetangjiaruView;

@Service("ketangjiaruService")
public class KetangjiaruServiceImpl extends ServiceImpl<KetangjiaruDao, KetangjiaruEntity> implements KetangjiaruService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetangjiaruEntity> page = this.selectPage(
                new Query<KetangjiaruEntity>(params).getPage(),
                new EntityWrapper<KetangjiaruEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetangjiaruEntity> wrapper) {
		  Page<KetangjiaruView> page =new Query<KetangjiaruView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetangjiaruVO> selectListVO(Wrapper<KetangjiaruEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetangjiaruVO selectVO(Wrapper<KetangjiaruEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetangjiaruView> selectListView(Wrapper<KetangjiaruEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetangjiaruView selectView(Wrapper<KetangjiaruEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
