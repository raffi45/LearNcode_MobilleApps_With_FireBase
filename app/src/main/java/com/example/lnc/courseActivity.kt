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

        binding.satu.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WtBF_-pLrjE&list=PLZS-MHyEIRo4Ze0bbGB1WKBSNMPzi-eWI&ab_channel=KelasTerbuka")))
        }

        binding.dua.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kxarfCiubWc&list=PLZS-MHyEIRo4Ze0bbGB1WKBSNMPzi-eWI&index=2&ab_channel=KelasTerbuka")))
        }

        binding.tiga.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KSMQXpoBfzY&list=PLZS-MHyEIRo4Ze0bbGB1WKBSNMPzi-eWI&index=3&pp=iAQB")))
        }

        binding.empat.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=UUX1vHGIcNQ&list=PLZS-MHyEIRo4Ze0bbGB1WKBSNMPzi-eWI&index=4&pp=iAQB")))
        }

        binding.lima.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=U9LfAoW8NXs&list=PLZS-MHyEIRo4Ze0bbGB1WKBSNMPzi-eWI&index=5&pp=iAQB")))
        }





        }
    }


