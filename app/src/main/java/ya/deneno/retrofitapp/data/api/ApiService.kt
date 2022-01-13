package ya.deneno.retrofitapp.data.api

import retrofit2.Response
import retrofit2.http.GET
import ya.deneno.retrofitapp.model.cash.Cash
import ya.deneno.retrofitapp.model.cashless.Cashless

interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCashForApi(): Response<Cash>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getCashlessForApi(): Response<Cashless>
}