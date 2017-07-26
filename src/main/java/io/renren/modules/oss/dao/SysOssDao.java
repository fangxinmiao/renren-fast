package io.renren.modules.oss.dao;

import io.renren.modules.oss.entity.SysOssEntity;
import io.renren.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件上传
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-25 12:13:26
 */
@Mapper
@Repository
public interface SysOssDao extends BaseDao<SysOssEntity> {

}
