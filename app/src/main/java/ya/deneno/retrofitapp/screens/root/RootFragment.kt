package ya.deneno.retrofitapp.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import ya.deneno.retrofitapp.R
import ya.deneno.retrofitapp.ViewPagerAdapter
import ya.deneno.retrofitapp.databinding.FragmentRootBinding

class RootFragment : Fragment() {
    lateinit var binding: FragmentRootBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRootBinding.inflate(layoutInflater, container, false)
        binding.tabLayout.tabIconTint = null
        binding.viewPager.adapter = ViewPagerAdapter(requireContext() as FragmentActivity)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) {
                tab, pos ->
            when(pos) {
                0 -> tab.setIcon(R.drawable.ic_baseline_attach_money_24)
                1 -> tab.setIcon(R.drawable.ic_baseline_monetization_on_24)
            }
        }.attach()
        return binding.root
    }



}