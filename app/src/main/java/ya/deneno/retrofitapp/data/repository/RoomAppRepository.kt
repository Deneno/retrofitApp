package ya.deneno.retrofitapp.data.repository

import retrofit2.Response
import ya.deneno.retrofitapp.data.api.RetrofitInstance
import ya.deneno.retrofitapp.model.cash.Cash
import ya.deneno.retrofitapp.model.cash.CashItem
import ya.deneno.retrofitapp.model.cashless.Cashless
import ya.deneno.retrofitapp.model.cashless.CashlessItem

class RoomAppRepository {
    suspend fun getCash(): Response<Cash> {
        return RetrofitInstance.api.getCashForApi()
    }

    suspend fun getCashless(): Response<Cashless> {
        return RetrofitInstance.api.getCashlessForApi()
    }
}