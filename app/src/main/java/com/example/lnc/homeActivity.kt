package com.example.lnc

//import android.R
import android.R.attr.text
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.lnc.databinding.HomeBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel



class homeActivity : ComponentActivity() {

    lateinit var binding: HomeBinding
    lateinit var auth : FirebaseAuth
    lateinit var textemail: TextView
    lateinit var dbref: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = HomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        dbref = FirebaseDatabase.getInstance().getReference("user")

        textemail = binding.textView2
        val email = intent.getStringExtra("email")

        val send : String = email.toString()

        val getnama  = intent.getStringExtra("nama")
        val nama : String = getnama.toString()

        if (getnama.isNullOrEmpty()){
            binding.textView2.text = send
        }else{
                binding.textView2.text = nama
        }



        val imageSlider = binding.imgSlider
        val imageList = ArrayList<SlideModel>();


        imageList.add(SlideModel(R.drawable.slides2, ScaleTypes.FIT));
        imageList.add(SlideModel(R.drawable.slides3, ScaleTypes.FIT));
        imageList.add(SlideModel(R.drawable.slides4, ScaleTypes.FIT));
        imageList.add(SlideModel(R.drawable.slides5, ScaleTypes.FIT));
        imageList.add(SlideModel(R.drawable.slides1, ScaleTypes.FIT));

        imageSlider.setImageList(imageList, ScaleTypes.FIT);

        auth = FirebaseAuth.getInstance()



        binding.imageView.setOnClickListener{
            startActivity(Intent(this,editprofileActivity::class.java).putExtra("email",send))
        }
        binding.logoCpp.setOnClickListener {
            startActivity(Intent(this, courseActivity::class.java).putExtra("email",send))

        }
        binding.php.setOnClickListener {
            startActivity(Intent(this, phpActivity::class.java).putExtra("email",send))

        }

        binding.btnProfil.setOnClickListener{
            startActivity(Intent(this,editprofileActivity::class.java).putExtra("email",send))
        }
        binding.btnArticle.setOnClickListener{
            startActivity(Intent(this,artikeActivity::class.java).putExtra("email",send))
        }

        binding.java.setOnClickListener {
            startActivity(Intent(this, phpActivity::class.java).putExtra("email",send))

        }

        binding.python.setOnClickListener {
            startActivity(Intent(this, pythonActivity::class.java).putExtra("email",send))

        }

        binding.kotlin.setOnClickListener {
            startActivity(Intent(this, kotlinActivity::class.java).putExtra("email",send))

        }

        binding.dart.setOnClickListener {
            startActivity(Intent(this, dartActivity::class.java).putExtra("email",send))

        }

        binding.sql.setOnClickListener {
            startActivity(Intent(this, sqlActivity::class.java).putExtra("email",send))

        }

        binding.csharp.setOnClickListener {
            startActivity(Intent(this, ccActivity::class.java).putExtra("email",send))

        }





}}

