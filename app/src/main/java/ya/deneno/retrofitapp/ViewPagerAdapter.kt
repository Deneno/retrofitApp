package ya.deneno.retrofitapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ya.deneno.retrofitapp.screens.cash.CashAdapter
import ya.deneno.retrofitapp.screens.cash.CashFragment
import ya.deneno.retrofitapp.screens.cashless.CashlessFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CashFragment()
            else -> CashlessFragment()
        }
    }

}