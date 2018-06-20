package cn.net.aipic.spring.cloud.weather.service;

import cn.net.aipic.spring.cloud.weather.vo.WeatherResponse;

/**
 * 天气数据 Service.
 */
public interface WeatherDataService {

    /**
     * 根据城市ID查询天气数据
     *
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);

    /**
     * 根据城市名称查询天气数据
     *
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);
}
