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


import com.dao.QiandaoqingkuangDao;
import com.entity.QiandaoqingkuangEntity;
import com.service.QiandaoqingkuangService;
import com.entity.vo.QiandaoqingkuangVO;
import com.entity.view.QiandaoqingkuangView;

@Service("qiandaoqingkuangService")
public class QiandaoqingkuangServiceImpl extends ServiceImpl<QiandaoqingkuangDao, QiandaoqingkuangEntity> implements QiandaoqingkuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiandaoqingkuangEntity> page = this.selectPage(
                new Query<QiandaoqingkuangEntity>(params).getPage(),
                new EntityWrapper<QiandaoqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiandaoqingkuangEntity> wrapper) {
		  Page<QiandaoqingkuangView> page =new Query<QiandaoqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiandaoqingkuangVO> selectListVO(Wrapper<QiandaoqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiandaoqingkuangVO selectVO(Wrapper<QiandaoqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiandaoqingkuangView> selectListView(Wrapper<QiandaoqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiandaoqingkuangView selectView(Wrapper<QiandaoqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
