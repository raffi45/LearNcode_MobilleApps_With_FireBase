package com.example.lnc

import android.content.Intent
import android.net.Uri
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

import com.example.lnc.databinding.PythonBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class pythonActivity : ComponentActivity() {

    lateinit var binding: PythonBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = PythonBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.satu.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=iA8lLwmtKQM&list=RDCMUCnrZ-UFSzeMSxKx_OHtwKsQ&index=1")
                )
            )
        }

        binding.dua.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=xETkm9H6aaY&list=RDCMUCnrZ-UFSzeMSxKx_OHtwKsQ&index=2")
                )
            )
        }

        binding.tiga.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=-auWrbiaoGc&list=RDCMUCnrZ-UFSzeMSxKx_OHtwKsQ&index=3")
                )
            )
        }

        binding.empat.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=gxmTFXfrMzk&list=RDCMUCnrZ-UFSzeMSxKx_OHtwKsQ&index=15")
                )
            )
        }

        binding.lima.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=b3X0CH98Y9g&list=RDCMUCnrZ-UFSzeMSxKx_OHtwKsQ&index=4")
                )
            )
        }

    }}



