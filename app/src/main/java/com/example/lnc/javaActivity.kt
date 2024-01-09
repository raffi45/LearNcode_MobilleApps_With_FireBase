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
import com.example.lnc.databinding.JavaBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class javaActivity : ComponentActivity() {

    lateinit var binding: JavaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = JavaBinding.inflate(layoutInflater)
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
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uHyfQV0kbgo&list=PLZS-MHyEIRo51w0Hmqi0C8h2KWNzDfo6F&index=1&pp=iAQB")))
        }

        binding.dua.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OrgFwUl2tzQ&list=PLZS-MHyEIRo51w0Hmqi0C8h2KWNzDfo6F&index=2&pp=iAQB")))
        }

        binding.tiga.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-09UiNKwpok&list=PLZS-MHyEIRo51w0Hmqi0C8h2KWNzDfo6F&index=3&pp=iAQB")))
        }

        binding.empat.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=B1cDwfxs1VM&list=PLZS-MHyEIRo51w0Hmqi0C8h2KWNzDfo6F&index=4&pp=iAQB")))
        }

        binding.lima.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LwWzmEIibwM&list=PLZS-MHyEIRo51w0Hmqi0C8h2KWNzDfo6F&index=5&pp=iAQB")))
        }
    }
}

