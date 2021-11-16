package com.serglife.navigationandmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(0,1,0,"new menu item")

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_nav, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val host =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        NavigationUI.onNavDestinationSelected(item, host.navController)
        return super.onOptionsItemSelected(item)
    }
}