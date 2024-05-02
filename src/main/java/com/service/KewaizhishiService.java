package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KewaizhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KewaizhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KewaizhishiView;


/**
 * 学习视频
 *
 * @author 
 * @email 
 * @date 2021-02-22 15:48:18
 */
public interface KewaizhishiService extends IService<KewaizhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KewaizhishiVO> selectListVO(Wrapper<KewaizhishiEntity> wrapper);
   	
   	KewaizhishiVO selectVO(@Param("ew") Wrapper<KewaizhishiEntity> wrapper);
   	
   	List<KewaizhishiView> selectListView(Wrapper<KewaizhishiEntity> wrapper);
   	
   	KewaizhishiView selectView(@Param("ew") Wrapper<KewaizhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KewaizhishiEntity> wrapper);
   	
}

