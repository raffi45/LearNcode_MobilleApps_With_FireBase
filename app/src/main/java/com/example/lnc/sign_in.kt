package com.example.lnc

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
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
import com.example.lnc.databinding.LoginBinding
import com.example.lnc.ui.theme.LncTheme
import com.google.firebase.auth.FirebaseAuth



class sign_in : ComponentActivity() {

    lateinit var binding: LoginBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = LoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

//        binding.lupaAkun.setOnClickListener {
//            val intent = Intent(this, ResetPasswordActivity::class.java)
//            startActivity(intent)
//        }

        binding.textregist.setOnClickListener {
            val intent = Intent(this, registActivity::class.java)
            startActivity(intent)
        }
        binding.buttonLogin.setOnClickListener {
            val email = binding.emailLogin.text.toString()
            val password = binding.passwordLogin.text.toString()

            //Validasi email
            if (email.isEmpty()) {
                binding.emailLogin.error = "Email Harus Diisi"
                binding.emailLogin.requestFocus()
                return@setOnClickListener
            }



            //Validasi password
            if (password.isEmpty()) {
                binding.passwordLogin.error = "Password Harus Diisi"
                binding.passwordLogin.requestFocus()
                return@setOnClickListener
            }

            LoginFirebase(email, password)
        }
    }

    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    val email2 = binding.emailLogin.text.toString()
                    Toast.makeText(this, "Selamat datang $email", Toast.LENGTH_SHORT).show()
//                    val intent = Intent(this, homeActivity::class.java)

                    startActivity(Intent(this,homeActivity::class.java).putExtra("email",email2))
//                        .also {
//                        it.putExtra("username",email)
//                        startActivity(it)
//                    }

//                    startActivity(intent)


                } else {
                    Toast.makeText(this, "pasword/email salah ", Toast.LENGTH_SHORT).show()
                }
            }
    }
}

