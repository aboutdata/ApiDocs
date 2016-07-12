package com.jdz.apidocs.dao;

import com.jdz.apidocs.domain.ApiDoc;
import com.jdz.apidocs.rest.response.ApiDocModel;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ApiDocMapper {

    public void save(ApiDoc apiDoc);

    public List<ApiDocModel> findByPage();

    public ApiDocModel findById(int id);

    public List<ApiDocModel> findByCategoryId(int categoryId);
}
