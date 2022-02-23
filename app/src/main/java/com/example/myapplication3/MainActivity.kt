package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        var result = addnum(3, 7)
        var str = stringFromJNI()
        binding.sampleText.text = "$str and $result"
    }

    /**
     * A native method that is implemented by the 'myapplication3' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
    external fun addnum(a:Int, b: Int): Int

    companion object {
        // Used to load the 'myapplication3' library on application startup.
        init {
            System.loadLibrary("myapplication3")
        }
    }
}