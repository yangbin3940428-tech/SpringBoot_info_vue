package com.zxjz.info.mapper;

import com.zxjz.info.polo.InfoCategoryData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yangbin
 */
@Mapper
public interface InfoMapper {
    List<InfoCategoryData> getInfoCategoryList();


}
