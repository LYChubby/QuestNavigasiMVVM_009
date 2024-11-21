package com.example.latihan5

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.latihan5.ui.viewmodel.MahasiswaViewModel

enum class Halaman{
    Form,
    Data
}

@Composable
fun Navigation(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
) {

}