package popup.demo.com.org.demokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        println("sum: ${sum(10,5)}")
        println("sum: ${sum03(10,"ABC")}")
    }



    fun sum02(a: Int, b: Int) = a * b;

    fun sum03(a: Int, b: String) = b + a;
}
