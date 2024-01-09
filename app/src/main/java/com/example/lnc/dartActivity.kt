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
import com.example.lnc.databinding.DartBinding
import com.example.lnc.databinding.JavaBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class dartActivity : ComponentActivity() {

    lateinit var binding: DartBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DartBinding.inflate(layoutInflater)
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
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Y1rP885vfH0&list=PLe8n__MJ2In6TjMMRTscFBAsul89E-bDX&index=1&pp=iAQB")))
        }

        binding.dua.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Bv9iW8xBW30&list=PLe8n__MJ2In6TjMMRTscFBAsul89E-bDX&index=2&pp=iAQB")))
        }

        binding.tiga.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RE8VGr9N0UI&list=PLe8n__MJ2In6TjMMRTscFBAsul89E-bDX&index=5&pp=iAQB")))
        }

        binding.empat.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OyK054hYIMY&list=PLe8n__MJ2In6TjMMRTscFBAsul89E-bDX&index=6&pp=iAQB")))
        }

        binding.lima.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KueFkBwMPaM&list=PLe8n__MJ2In6TjMMRTscFBAsul89E-bDX&index=7&pp=iAQB")))
        }
    }
}

