package com.example.lnc

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lnc.databinding.EditProfileBinding
import com.example.lnc.databinding.ProfileBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class editprofileActivity : ComponentActivity() {
    lateinit var binding: EditProfileBinding
    lateinit var dbref: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = EditProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        dbref = FirebaseDatabase.getInstance().getReference("user")
        val getemail  = intent.getStringExtra("email")
        val email : String = getemail.toString()

        binding.buttonedit.setOnClickListener {
            val nama = binding.nama.text.toString()
            val alamat = binding.alamat.text.toString()
            val telp = binding.telp.text.toString()

            val send : String = nama.toString()

            if (nama.isEmpty()) {
                binding.nama.error = "Email Harus Diisi"
                binding.nama.requestFocus()
                return@setOnClickListener
            }
            if (alamat.isEmpty()) {
                binding.alamat.error = "alamat Harus Diisi"
                binding.alamat.requestFocus()
                return@setOnClickListener
            }
            if (telp.isEmpty()) {
                binding.telp.error = "no telp Harus Diisi"
                binding.telp.requestFocus()
                return@setOnClickListener
            }

            dbref = FirebaseDatabase.getInstance().getReference("user")
            val User = User(nama,alamat,telp)
            dbref.child(nama).setValue(User).addOnSuccessListener {

                binding.nama.text.clear()
                binding.alamat.text.clear()
                binding.telp.text.clear()

                Toast.makeText(this,"Successfully Saved",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,profileActivity::class.java).putExtra("nama",send))


            }.addOnFailureListener{

                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()


            }
        }



        }
    }

