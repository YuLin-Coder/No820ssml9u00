package com.entity.view;

import com.entity.DiscussjiaoxueziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教学资源评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
@TableName("discussjiaoxueziyuan")
public class DiscussjiaoxueziyuanView  extends DiscussjiaoxueziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiaoxueziyuanView(){
	}
 
 	public DiscussjiaoxueziyuanView(DiscussjiaoxueziyuanEntity discussjiaoxueziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiaoxueziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
