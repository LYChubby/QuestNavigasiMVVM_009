package com.example.latihan5.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.latihan5.model.Mahasiswa

@Composable
fun DetailMahasiswaView(
    dataMhs:Mahasiswa,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Gender", dataMhs.gender),
        Pair("NIM", dataMhs.nim),
        Pair("Alamat", dataMhs.alamat),
        Pair("Email", dataMhs.email),
        Pair("No Telepon", dataMhs.nohp)
    )

    Column (
        modifier = modifier.fillMaxSize() .padding(16.dp)
    ){
        listDataMhs.forEach { data->
            DetailMhs(judul = data.first,
                isi = data.second)
        }

        Button(onClick = {onBackButtonClicked()}) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun DetailMhs(
    judul: String, isi: String
) {


    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(10.dp)

    ){
        Text(text = judul,
            modifier = Modifier.weight(0.8f))
        Text(text = ":",
            modifier = Modifier.weight(0.2f))
        Text(text = isi,
            modifier = Modifier.weight(2f))
    }
}