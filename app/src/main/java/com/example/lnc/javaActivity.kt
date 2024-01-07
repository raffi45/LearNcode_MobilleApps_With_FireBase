package com.example.lnc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lnc.databinding.Course1Binding
import com.example.lnc.databinding.JavaBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class javaActivity : ComponentActivity() {

    lateinit var binding: JavaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = JavaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}

