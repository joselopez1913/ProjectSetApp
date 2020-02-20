package co.edu.udea.compumovil.gr01_20192.projectsetapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "No hay eventos programados"
    }
    val text: LiveData<String> = _text
}