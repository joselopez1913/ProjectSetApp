package co.edu.udea.compumovil.gr01_20192.projectsetapp.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "No hay clases programadas"
    }
    val text: LiveData<String> = _text
}