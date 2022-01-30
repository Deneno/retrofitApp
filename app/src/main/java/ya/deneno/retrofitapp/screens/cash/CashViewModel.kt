package ya.deneno.retrofitapp.screens.cash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ya.deneno.retrofitapp.data.repository.RoomAppRepository
import ya.deneno.retrofitapp.model.cash.Cash

class CashViewModel: ViewModel() {
    private var repo = RoomAppRepository()
    var myMoneyList: MutableLiveData<Response<Cash>> = MutableLiveData()

    fun getCashMoney() {
       viewModelScope.launch {
           myMoneyList.value = repo.getCash()
       }
    }
}