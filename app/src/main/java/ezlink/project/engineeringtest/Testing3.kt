package ezlink.project.engineeringtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.testing3.*
import java.sql.DriverManager.println

class Testing3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing3)

        btn1.setOnClickListener {
            FizzBuzz()
        }
    }

    fun FizzBuzz(){
        for (i in 1..100){
            when {
                (i % 3 == 0 && i % 5 == 0) -> System.out.println("FizzBuzz")
                i % 3 == 0 -> System.out.println("Fizz")
                i % 5 == 0 -> System.out.println("Buzz")
                else -> System.out.println("$i")
            }
        }
    }
}