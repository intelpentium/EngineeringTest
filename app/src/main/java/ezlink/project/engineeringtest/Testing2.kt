package ezlink.project.engineeringtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.testing2.*

class Testing2 : AppCompatActivity() {
    var data: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing2)

        btn1.setOnClickListener {
            data = 3
            System.out.println("Result: "+sum(data!!))
            Popup.PopupSuccess(this, "Result: "+sum(data!!))
        }
    }

    fun sum(n: Int): Int {
        return n * (n + 1) / 2;
    }

    fun tes(){

    }
}