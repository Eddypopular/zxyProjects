/*
 * Created by Zhu XiYong <zuxiyo@sohu.com> at 2016年9月8日下午6:43:16
 * 
 * 作        者：Zhu XiYong(zuxiyo@sohu.com)
 * 创建时间： 2016年9月8日下午6:43:16
 */
package com.zxy.admin.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zxy.admin.entities.DictionaryItemInfo;

/**
 * 数据字典具体项数据层接口
 * @author Zhu XiYong 
 * @Date 2016年9月8日下午6:43:16
 */
public interface IDictionaryItemsDao extends PagingAndSortingRepository<DictionaryItemInfo,String>{

	/**
	 * 通过字典的类别找到字典项
	 * @param pageable
	 * @return
	 */
	Page<DictionaryItemInfo> findByCategoryCode(Pageable pageable,String categoryCode);

	/**
	 * @param dictionaryCode
	 */
	Iterable<DictionaryItemInfo> findByCategoryCode(String categoryCode);

}
