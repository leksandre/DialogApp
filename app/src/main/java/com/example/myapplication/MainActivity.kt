package com.example.myapplication

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }

        }



        Log.w("myTag2w", "This is my message2w");
        Log.v("myTag2v", "This is my message2v");
        Log.i("myTag2i", "This is my message2i");
        Log.e("myTag2e", "This is my message2e");
        Log.d("myTag2d", "This is my message2d");
        myButton()






    }
}





private fun myButton(){
    Log.w("myTag1w", "This is my message1w");
    Log.v("myTag1v", "This is my message1v");
    Log.i("myTag1i", "This is my message1i");
    Log.e("myTag1e", "This is my message1e");
    Log.d("myTag1d", "This is my message1d");
//    val mMyBtn = new Button()
//    View currentView = this.getWindow().getDecorView().findViewById(android.R.id.content)
//    Log.d("myTag", "This is my message");
//    mMyBtn.setOnClickListener {
//        // and then put ur logic here
//        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
//    }

}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}