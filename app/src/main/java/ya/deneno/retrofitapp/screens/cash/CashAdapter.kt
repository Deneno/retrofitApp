package ya.deneno.retrofitapp.screens.cash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ya.deneno.retrofitapp.R
import ya.deneno.retrofitapp.databinding.ItemMoneyLayoutBinding
import ya.deneno.retrofitapp.model.cash.Cash
import ya.deneno.retrofitapp.model.cash.CashItem

class CashAdapter: RecyclerView.Adapter<CashAdapter.CashViewHolder>() {

    var cashList = emptyList<CashItem>()

    class CashViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = ItemMoneyLayoutBinding.bind(view)

        fun bind(cash: CashItem) {
            binding.apply {
                itemName.text = cash.ccy
                itemBuy.text = cash.buy
                itemSale.text = cash.sale
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CashViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return CashViewHolder(view)
    }

    override fun onBindViewHolder(holder: CashViewHolder, position: Int) {
        holder.bind(cashList[position])
    }

    override fun getItemCount(): Int {
        return cashList.size
    }
    fun setList(list: Cash) {
        cashList = list
        notifyDataSetChanged()
    }
}