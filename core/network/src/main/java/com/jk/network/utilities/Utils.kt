package com.jk.network.utilities

object Utils {

    const val FORECAST_BASE_URL = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m&forecast_days=7&daily=temperature_2m_max,temperature_2m_min&past_days=1&temperature_unit=fahrenheit"
    const val GEOCODING_URL = "https://api.openweathermap.org/geo/1.0/direct?q=Nairobi&limit=5&appid=803287d9c74babdf2a1a3a5a11b7e499"
    const val CURRENT_WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=803287d9c74babdf2a1a3a5a11b7e499"

}