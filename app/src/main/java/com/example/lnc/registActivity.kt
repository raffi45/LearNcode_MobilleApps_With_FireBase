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
import com.example.lnc.databinding.RegisterBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth

class registActivity : ComponentActivity() {

    lateinit var auth : FirebaseAuth
    lateinit var binding: RegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = RegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        auth = FirebaseAuth.getInstance()

//        binding.tvToLogin.setOnClickListener {
//            val intent = Intent(this, sign_in::class.java)
//            startActivity(intent)
//        }

        binding.buttonregist.setOnClickListener{
            val email = binding.emailText.text.toString()
            val password = binding.passwordText.text.toString()
            if (email.isEmpty()) {
                binding.emailText.error = "Email Harus Diisi"
                binding.emailText.requestFocus()
                return@setOnClickListener
            }

            //Validasi password
            if (password.isEmpty()) {
                binding.passwordText.error = "Password Harus Diisi"
                binding.passwordText.requestFocus()
                return@setOnClickListener
            }

            //Validasi panjang password
            if (password.length < 6) {
                binding.passwordText.error = "Password Minimal 6 Karakter"
                binding.passwordText.requestFocus()
                return@setOnClickListener
            }
            RegisterFirebase(email, password)
        }

    }

    private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, sign_in::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()

                }
            }
    }

}

