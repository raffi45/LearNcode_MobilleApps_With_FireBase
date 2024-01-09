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
import com.example.lnc.databinding.KotlinBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class kotlinActivity : ComponentActivity() {

    lateinit var binding: KotlinBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = KotlinBinding.inflate(layoutInflater)
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
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6dSNbskzlz4&list=PL-CtdCApEFH_hja5vRJgQOXylCiQud7Qa&index=1&pp=iAQB")))
        }

        binding.dua.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DhRIBJ6q8Ks&list=PL-CtdCApEFH_hja5vRJgQOXylCiQud7Qa&index=2&pp=iAQB")))
        }

        binding.tiga.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=d_ip0wTcKvw&list=PL-CtdCApEFH_hja5vRJgQOXylCiQud7Qa&index=3&pp=iAQB")))
        }

        binding.empat.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=F1UqaaiPnJM&list=PL-CtdCApEFH_hja5vRJgQOXylCiQud7Qa&index=4&pp=iAQB")))
        }

        binding.lima.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kNCsS40aCv8&list=PL-CtdCApEFH_hja5vRJgQOXylCiQud7Qa&index=5&pp=iAQB")))
        }
    }
}

