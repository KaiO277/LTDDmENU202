package com.example.menu202

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionsmenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.message ->{
                Toast.makeText(
                    getApplicationContext(),
                    "You clicked Message menu",
                    Toast.LENGTH_SHORT
                ).show()
                return true
            }
            R.id.picture ->{
                val intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(intent)
                return (true)
            }
            R.id.mode ->{
                val intent = Intent(Intent.ACTION_DIAL)
                startActivity(intent)
                return (true)
            }
            R.id.option_favorites1 -> {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, "zingmp3.vn")
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }
                return (true)
            }
            R.id.option_favorites2 -> {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, "facebook.com")
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }
                return (true)
            }
            R.id.option_favorites3 -> {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, "youtube.com")
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }
                return (true)
            }
            R.id.about -> {
                Toast.makeText(getApplicationContext(), "You clicked About menu",
                    Toast.LENGTH_SHORT).show()
                return (true)
            }
            R.id.exit ->{
                finish()
                return (true)
            }
        }
        return (super.onOptionsItemSelected(item))
    }
}