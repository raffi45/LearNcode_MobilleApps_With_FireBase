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
import com.example.lnc.databinding.HomeBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class homeActivity : ComponentActivity() {

    lateinit var binding: HomeBinding
    lateinit var auth : FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = HomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.logoCpp.setOnClickListener {
            val intent = Intent(this, courseActivity::class.java)
            startActivity(intent)
        }
        binding.php.setOnClickListener {
            val intent = Intent(this, phpActivity::class.java)
            startActivity(intent)
        }

        binding.java.setOnClickListener {
            val intent = Intent(this, phpActivity::class.java)
            startActivity(intent)
        }


}}

