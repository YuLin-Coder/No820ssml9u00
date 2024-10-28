package com.entity.view;

import com.entity.DiscussketangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课堂信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
@TableName("discussketangxinxi")
public class DiscussketangxinxiView  extends DiscussketangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussketangxinxiView(){
	}
 
 	public DiscussketangxinxiView(DiscussketangxinxiEntity discussketangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussketangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
