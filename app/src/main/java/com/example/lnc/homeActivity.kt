package com.example.lnc

import android.R
import android.R.attr.text
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.lnc.databinding.HomeBinding
import com.google.firebase.auth.FirebaseAuth


class homeActivity : ComponentActivity() {

    lateinit var binding: HomeBinding
    lateinit var auth : FirebaseAuth
    lateinit var textemail: TextView



    override fun onCreate(savedInstanceState: Bundle?) {



//        val sessionuser = intent.getStringExtra("username")
//        val textView = binding.textView2.apply {
//            text = sessionuser
//        }


        binding = HomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        textemail = binding.textView2
        val email = intent.getStringExtra("email")
        textemail.text = email


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

