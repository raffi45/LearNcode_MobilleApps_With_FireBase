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
import com.example.lnc.databinding.CcBinding
import com.example.lnc.databinding.JavaBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class ccActivity : ComponentActivity() {

    lateinit var binding: CcBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = CcBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.satu.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yF-3Ho42yzw&list=PLCDGzSRUHf-Gvhnt6fBH0fUtv32Id6xx_&index=3&pp=iAQB")))
        }

        binding.dua.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=POBhZU0CgBo&list=PLCDGzSRUHf-Gvhnt6fBH0fUtv32Id6xx_&index=4&pp=iAQB")))
        }

        binding.tiga.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NAJu6beHO6I&list=PLCDGzSRUHf-Gvhnt6fBH0fUtv32Id6xx_&index=5&pp=iAQB")))
        }

        binding.empat.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DA5RReYn5NQ&list=PLCDGzSRUHf-Gvhnt6fBH0fUtv32Id6xx_&index=6&pp=iAQB")))
        }

        binding.lima.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=vQ_LGR--QuQ&list=PLCDGzSRUHf-Gvhnt6fBH0fUtv32Id6xx_&index=7&pp=iAQB")))
        }

        binding.btnHome.setOnClickListener{
            startActivity(Intent(this,homeActivity::class.java))
        }
    }
}

