package cn.net.aipic.spring.cloud.weather.service;

import cn.net.aipic.spring.cloud.weather.vo.Weather;

public interface WeatherReportService {

    /**
     * 根据城市ID查询天气信息
     * @param cityId
     * @return
     */
    Weather getDataByCityId(String cityId);
}
