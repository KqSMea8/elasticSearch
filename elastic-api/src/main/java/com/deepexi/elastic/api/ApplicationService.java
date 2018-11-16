package com.deepexi.elastic.api;

import com.deepexi.elastic.domain.eo.ApplicationEo;

import java.util.Map;

public interface ApplicationService {

    Object createApplication(Map<String,Object> map);

    Integer update(ApplicationEo eo);

    Object create(ApplicationEo eo);

    Object delete(Long pk);

    Object delete(Long[] pks);

}
