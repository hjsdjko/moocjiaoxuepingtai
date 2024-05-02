package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskewaizhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskewaizhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskewaizhishiView;


/**
 * 学习视频评论表
 *
 * @author 
 * @email 
 * @date 2021-02-22 15:48:18
 */
public interface DiscusskewaizhishiService extends IService<DiscusskewaizhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskewaizhishiVO> selectListVO(Wrapper<DiscusskewaizhishiEntity> wrapper);
   	
   	DiscusskewaizhishiVO selectVO(@Param("ew") Wrapper<DiscusskewaizhishiEntity> wrapper);
   	
   	List<DiscusskewaizhishiView> selectListView(Wrapper<DiscusskewaizhishiEntity> wrapper);
   	
   	DiscusskewaizhishiView selectView(@Param("ew") Wrapper<DiscusskewaizhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskewaizhishiEntity> wrapper);
   	
}

