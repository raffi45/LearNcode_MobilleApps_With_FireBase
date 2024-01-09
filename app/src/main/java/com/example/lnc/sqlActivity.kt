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
import com.example.lnc.databinding.SqlBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class sqlActivity : ComponentActivity() {

    lateinit var binding: SqlBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = SqlBinding.inflate(layoutInflater)
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
        binding.btnArticle.setOnClickListener{
            startActivity(Intent(this,artikeActivity::class.java).putExtra("email",send))
        }

        binding.satu.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=tDO0g3pbp5U&list=PL3uuG4lYbnOw-KF5MvnL6XUFVl5EfZqLq&index=1&pp=iAQB")
                )
            )
        }

        binding.dua.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=SWs0j2LzcD4&list=PL3uuG4lYbnOw-KF5MvnL6XUFVl5EfZqLq&index=2&pp=iAQB")
                )
            )
        }

        binding.tiga.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=1nZB6cSOVD4&list=PL3uuG4lYbnOw-KF5MvnL6XUFVl5EfZqLq&index=3&pp=iAQB")
                )
            )
        }

        binding.empat.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=1nZB6cSOVD4&list=PL3uuG4lYbnOw-KF5MvnL6XUFVl5EfZqLq&index=3&pp=iAQB")
                )
            )
        }

        binding.lima.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=W7daw4Gn1eE&list=PL3uuG4lYbnOw-KF5MvnL6XUFVl5EfZqLq&index=5&pp=iAQB")
                )
            )
        }

    }}



