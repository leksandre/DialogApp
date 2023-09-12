package com.example.myapplication

import android.os.Bundle
import android.util.Log
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
        val message = "onCreate"
        val TAG = "jopaAnd"
        Log.w(TAG, message);
        Log.v(TAG, message);
        Log.i(TAG, message);
        Log.e(TAG, message);
        Log.d(TAG, message);
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }

        }




        myButton()






    }


    override fun onStart() {
        super.onStart()
        val message = "onStart"
        val TAG = "jopaAnd"
        Log.w(TAG, message);
        Log.v(TAG, message);
        Log.i(TAG, message);
        Log.e(TAG, message);
        Log.d(TAG, message);
    }

    override fun onResume() {
        super.onResume()
        val message = "onResume"
        val TAG = "jopaAnd"
        Log.w(TAG, message);
        Log.v(TAG, message);
        Log.i(TAG, message);
        Log.e(TAG, message);
        Log.d(TAG, message);
    }

    override fun onPause() {
        super.onPause()
        val message = "onPause"
        val TAG = "jopaAnd"
        Log.w(TAG, message);
        Log.v(TAG, message);
        Log.i(TAG, message);
        Log.e(TAG, message);
        Log.d(TAG, message);
    }

    override fun onStop() {
        super.onStop()
        val message = "onStop"
        val TAG = "jopaAnd"
        Log.w(TAG, message);
        Log.v(TAG, message);
        Log.i(TAG, message);
        Log.e(TAG, message);
        Log.d(TAG, message);
    }

    override fun onDestroy() {
        super.onDestroy()
        val message = "onDestroy"
        val TAG = "jopaAnd"
        Log.w(TAG, message);
        Log.v(TAG, message);
        Log.i(TAG, message);
        Log.e(TAG, message);
        Log.d(TAG, message);
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