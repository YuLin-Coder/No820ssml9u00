package com.entity.view;

import com.entity.DiscussqiandaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 签到信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
@TableName("discussqiandaoxinxi")
public class DiscussqiandaoxinxiView  extends DiscussqiandaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussqiandaoxinxiView(){
	}
 
 	public DiscussqiandaoxinxiView(DiscussqiandaoxinxiEntity discussqiandaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussqiandaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
