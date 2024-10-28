package com.entity.view;

import com.entity.KetangjiaruEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课堂加入
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 15:22:30
 */
@TableName("ketangjiaru")
public class KetangjiaruView  extends KetangjiaruEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KetangjiaruView(){
	}
 
 	public KetangjiaruView(KetangjiaruEntity ketangjiaruEntity){
 	try {
			BeanUtils.copyProperties(this, ketangjiaruEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
