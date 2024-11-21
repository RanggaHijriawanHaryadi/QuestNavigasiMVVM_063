package com.example.pertemuan7

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan7.ui.view.DetailMahasiswaView
import com.example.pertemuan7.ui.view.FormMahasiswaView
import com.example.pertemuan7.ui.viewmodel.MahasiswaViewModel
import model.DataKelamin

enum class  Halaman {
    Formulir,
    Detail,
}
@Composable
fun PengelolaHalaman(
    modifier: Modifier = Modifier,
    navHost: NavController = rememberNavController(),
    viewModel: MahasiswaViewModel = viewModel()
){
    Scaffold { isipadding ->
        val uiState by viewModel.uiState.collectAsState()
        NavHost (
            modifier = modifier.padding(isipadding),
            navController = navHost, startDestination = Halaman.Formulir.name
        ){


        }
    }

}`