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
import com.example.lnc.databinding.PhpBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class phpActivity : ComponentActivity() {

    lateinit var binding: PhpBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = PhpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val email = intent.getStringExtra("email")

        val send : String = email.toString()

        binding.btnHome.setOnClickListener{
            startActivity(Intent(this,homeActivity::class.java).putExtra("email",send))
        }
        binding.btnProfil.setOnClickListener{
            startActivity(Intent(this,editprofileActivity::class.java).putExtra("email",send))
        }

        binding.satu.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=ieqLoRQxnK4&list=PLIan8aHxsPj2XZPXJOEBz1sdcw1UvM9Rq&ab_channel=WahidevAcademy")
                )
            )
        }

        binding.dua.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=xmdAQWG9GJQ&list=PLIan8aHxsPj2XZPXJOEBz1sdcw1UvM9Rq&index=2&pp=iAQB")
                )
            )
        }

        binding.tiga.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=SiF_CuGfXYQ&list=PLIan8aHxsPj2XZPXJOEBz1sdcw1UvM9Rq&index=3&pp=iAQB")
                )
            )
        }

        binding.empat.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=VbJeWqJKjLQ&list=PLIan8aHxsPj2XZPXJOEBz1sdcw1UvM9Rq&index=4&pp=iAQB")
                )
            )
        }

        binding.lima.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=eDLqDNv81D4&list=PLIan8aHxsPj2XZPXJOEBz1sdcw1UvM9Rq&index=5&pp=iAQB")
                )
            )
        }

    }}



