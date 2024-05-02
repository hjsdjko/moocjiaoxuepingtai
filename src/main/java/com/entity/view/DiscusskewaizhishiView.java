package com.entity.view;

import com.entity.DiscusskewaizhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课外知识评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-22 15:48:18
 */
@TableName("discusskewaizhishi")
public class DiscusskewaizhishiView  extends DiscusskewaizhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskewaizhishiView(){
	}
 
 	public DiscusskewaizhishiView(DiscusskewaizhishiEntity discusskewaizhishiEntity){
 	try {
			BeanUtils.copyProperties(this, discusskewaizhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
