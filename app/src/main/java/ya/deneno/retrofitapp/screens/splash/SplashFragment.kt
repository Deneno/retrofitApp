package ya.deneno.retrofitapp.screens.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.coroutines.*
import ya.deneno.retrofitapp.R
import ya.deneno.retrofitapp.databinding.FragmentCashBinding
import ya.deneno.retrofitapp.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(layoutInflater, container, false)
        CoroutineScope(Dispatchers.Main).launch {
            delay(1500)
            Navigation.findNavController(binding.root).navigate(R.id.action_splashFragment_to_rootFragment)
        }
        return binding.root
    }

}