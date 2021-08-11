package ezlink.project.engineeringtest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.testing.*

class Testing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing)

        btn1.setOnClickListener {
            val intent = Intent(this, Testing1::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, Testing2::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, Testing3::class.java)
            startActivity(intent)
        }
    }
}