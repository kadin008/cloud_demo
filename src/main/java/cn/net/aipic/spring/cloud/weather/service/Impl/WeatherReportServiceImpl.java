package cn.net.aipic.spring.cloud.weather.service.Impl;

import cn.net.aipic.spring.cloud.weather.service.WeatherDataService;
import cn.net.aipic.spring.cloud.weather.service.WeatherReportService;
import cn.net.aipic.spring.cloud.weather.vo.Weather;
import cn.net.aipic.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private WeatherDataService weatherDataService;

    @Override
    public Weather getDataByCityId(String cityId) {
        WeatherResponse resp = weatherDataService.getDataByCityId(cityId);
        return resp.getData();
    }
}
