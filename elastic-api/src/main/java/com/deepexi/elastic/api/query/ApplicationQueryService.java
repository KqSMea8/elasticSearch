package com.deepexi.elastic.api.query;

import com.deepexi.elastic.domain.dto.Payload;
import com.deepexi.elastic.domain.eo.ApplicationEo;

import java.util.Map;

public interface ApplicationQueryService {

    Object findAll();

    Object detail(Integer pk);
}
