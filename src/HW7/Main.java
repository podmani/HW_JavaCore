import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String cityCode = RequestHandler.detectCityID("Нижний Новгород");
        System.out.println("Код города: " + cityCode);
        String forecast = RequestHandler.getForecast(cityCode);
        System.out.println("Прогноз погоды на 1 день:");
        System.out.println(forecast);



    }
}
