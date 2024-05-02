package com.entity.view;

import com.entity.KewaizhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课外知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-22 15:48:18
 */
@TableName("kewaizhishi")
public class KewaizhishiView  extends KewaizhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KewaizhishiView(){
	}
 
 	public KewaizhishiView(KewaizhishiEntity kewaizhishiEntity){
 	try {
			BeanUtils.copyProperties(this, kewaizhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
