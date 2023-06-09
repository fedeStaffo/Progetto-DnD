package com.progetto_dd.view.characters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.progetto_dd.MainActivity
import com.progetto_dd.R

class VisualizzaPersonaggioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizza_personaggio)

        // Imposta la toolbar personalizzata
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar_view_char)
        setSupportActionBar(toolbar)

        // Configurazione del controller per navigare tra i fragment
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_view_characters) as NavHostFragment
        val navController = navHostFragment.navController

        val builder = AppBarConfiguration.Builder(navController.graph)

        // Abilita la navigazione quando un oggetto è cliccato sulla toolbar
        val appBarConfiguration = builder.build()
        toolbar.setupWithNavController(navController, appBarConfiguration)

        // Aggiunge la bottombar e la configura con il NavController
        val bottomNavView = findViewById<BottomNavigationView>(R.id.view_char_bottombar)
        bottomNavView.setupWithNavController(navController)

    }

    // Aggiunge gli item del menu alla toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.visualizza_personaggio_toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // Naviga sul fragment di destinazione quando un item è cliccato
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_view_characters)
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }

    fun openCharacterActivityFromViewChar(item: MenuItem){
        val intent = Intent(this, CharacterActivity::class.java)
        startActivity(intent)
    }
}