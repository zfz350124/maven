package cn.itcast.dao;

import cn.itcast.domain.Items;
import org.springframework.stereotype.Repository;

public interface ItemsDao {

     Items findById(Integer id);
}
