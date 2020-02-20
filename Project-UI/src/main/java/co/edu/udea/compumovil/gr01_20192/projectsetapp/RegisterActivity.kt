package co.edu.udea.compumovil.gr01_20192.projectsetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        backRegisterButton.setOnClickListener{
            val intent: Intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }
    }
}
