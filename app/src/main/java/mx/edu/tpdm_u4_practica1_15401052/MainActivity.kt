package mx.edu.tpdm_u4_practica1_15401052

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Lienzo(p = this))
        supportActionBar?.hide()
    }
}
