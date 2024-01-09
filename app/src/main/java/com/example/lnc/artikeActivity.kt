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
import com.example.lnc.databinding.ArtikeBinding
import com.example.lnc.databinding.DartBinding
import com.example.lnc.ui.theme.LncTheme

class artikeActivity : ComponentActivity() {

    lateinit var binding: ArtikeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ArtikeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.new1.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cnnindonesia.com/teknologi/20240102133635-190-1044315/4-cara-mengganti-akun-google-di-ponsel-android")))
        }
        binding.news2.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cnnindonesia.com/teknologi/20240108133438-192-1046709/cara-mengajukan-ganti-rugi-dari-google-simak-langkahnya")))
        }
        binding.news3.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cnnindonesia.com/teknologi/20240108114040-192-1046668/mengingat-kebocoran-data-kemenhan-yang-disinggung-anies-dalam-debat")))
        }
        binding.news4.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cnnindonesia.com/teknologi/20240109003829-192-1046945/prabowo-trending-topic-buntut-serangan-netizen-ungkit-memori-2019")))
        }
        binding.news5.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cnnindonesia.com/teknologi/20240105183633-192-1045854/kisah-pilu-remaja-diperkosa-virtual-di-dunia-metaverse-traumanya-riil")))
        }


    }
}

