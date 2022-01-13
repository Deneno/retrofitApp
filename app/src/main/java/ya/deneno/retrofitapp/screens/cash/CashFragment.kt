package ya.deneno.retrofitapp.screens.cash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import ya.deneno.retrofitapp.databinding.FragmentCashBinding

class CashFragment : Fragment() {
    private lateinit var binding: FragmentCashBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CashAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(CashViewModel::class.java)
        binding = FragmentCashBinding.inflate(layoutInflater, container, false)
        recyclerView = binding.rvCash
        adapter = CashAdapter()
        recyclerView.adapter = adapter
        viewModel.getCashMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(it)}
        }
        return binding.root
    }

}