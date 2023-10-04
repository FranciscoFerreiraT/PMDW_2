package com.dam.ejercicio2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dam.ejercicio2.ui.theme.Ejercicio2Theme

class MainActivity : ComponentActivity() {
    private var startTime: Long = 0
    val TAG ="Estado"
    val TAG2 ="TiempoDeActividad"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onPause() {
        super.onPause()

    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        Log.d(TAG,"OnStart")
        startTime = System.currentTimeMillis()


    }

    override fun onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        super.onStop()
        Log.d(TAG,"OnStop")

        val endTime = System.currentTimeMillis()
        val elapsedTime = endTime - startTime
        Log.d(TAG2, "La aplicación estuvo activa durante $elapsedTime milisegundos")
    }
    override fun onResume(){
        super.onResume()

    }



}
