package ya.deneno.retrofitapp.screens.cashless

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ya.deneno.retrofitapp.R
import ya.deneno.retrofitapp.databinding.ItemMoneyLayoutBinding
import ya.deneno.retrofitapp.model.cashless.CashlessItem

class CashlessAdapter : RecyclerView.Adapter<CashlessAdapter.CashlessViewHolder>() {

    var cashlessList = emptyList<CashlessItem>()

    class CashlessViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = ItemMoneyLayoutBinding.bind(view)

        fun bind(cash: CashlessItem) {
            binding.apply {
                itemName.text = cash.ccy
                itemBuy.text = cash.buy
                itemSale.text = cash.sale
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CashlessViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return CashlessViewHolder(view)
    }

    override fun onBindViewHolder(holder: CashlessViewHolder, position: Int) {
        holder.bind(cashlessList[position])
    }

    override fun getItemCount(): Int {
        return cashlessList.size
    }
    fun setList(list: List<CashlessItem>) {
        cashlessList = list
        notifyDataSetChanged()
    }
}