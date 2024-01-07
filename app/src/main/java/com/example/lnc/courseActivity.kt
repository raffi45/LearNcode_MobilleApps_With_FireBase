package com.example.lnc

import android.content.Intent
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
import com.example.lnc.databinding.HomeBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.common.net.InternetDomainName
import com.google.firebase.auth.FirebaseAuth

class courseActivity : ComponentActivity() {

    lateinit var binding: Course1Binding
    lateinit var auth : FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = Course1Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()



        }
    }


