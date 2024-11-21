package com.example.latihan5.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.latihan5.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    // Only Access Internal Class
    private val _dataModel = MutableStateFlow(Mahasiswa())

    // Access For Public
    val dataModel : StateFlow<Mahasiswa> = _dataModel.asStateFlow()

    fun saveDataMhs(
        listData : MutableList<String>
    ) {
        _dataModel.update { mhs ->
            mhs.copy(
                nama = listData[0],
                gender = listData[1],
                alamat = listData[2]
            )
        }
    }
}