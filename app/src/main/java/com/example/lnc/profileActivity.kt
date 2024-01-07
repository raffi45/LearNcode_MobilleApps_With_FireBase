package com.example.lnc

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lnc.databinding.HomeBinding
import com.example.lnc.databinding.ProfileBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class profileActivity : ComponentActivity() {

    lateinit var binding: ProfileBinding
    lateinit var dbref: DatabaseReference
    lateinit var nama: TextView
    lateinit var alamat: TextView
    lateinit var telp: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        dbref = FirebaseDatabase.getInstance().getReference("user")
        val getemail  = intent.getStringExtra("email")
        val email : String = getemail.toString()


            dbref.child(email).get().addOnSuccessListener {

                if (it.exists()) {

                    val namaid = it.child("nama").value
                    val alamatid = it.child("alamat").value
                    val telpid = it.child("telp").value

                    binding.nama.text = namaid.toString()
                    binding.alamat.text = alamatid.toString()
                    binding.telp.text = telpid.toString()


                }
            }


        binding.buttonedit.setOnClickListener{
            startActivity(Intent(this,editprofileActivity::class.java).putExtra("email",getemail))
        }


    }
}

