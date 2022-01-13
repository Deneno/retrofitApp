package ya.deneno.retrofitapp.screens.cashless

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ya.deneno.retrofitapp.data.repository.RoomAppRepositry
import ya.deneno.retrofitapp.model.cashless.Cashless

class CashlessViewModel: ViewModel() {
    private var repo = RoomAppRepositry()
    var myMoneyList: MutableLiveData<Response<Cashless>> = MutableLiveData()

    fun getCashlessMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getCashless()
        }
    }
}