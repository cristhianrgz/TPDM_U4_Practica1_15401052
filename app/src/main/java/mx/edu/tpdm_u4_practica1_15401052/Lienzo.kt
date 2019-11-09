package mx.edu.tpdm_u4_practica1_15401052

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi

class Lienzo(p:MainActivity): View(p){
    val imagen = BitmapFactory.decodeResource(resources,R.drawable.luna)
    val imgTrineo = BitmapFactory.decodeResource(resources, R.drawable.trineo)

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()

        setBackgroundColor(Color.rgb(45,59, 113))
        c.drawBitmap(imagen,850f,900f, p)
        c.drawBitmap(imgTrineo,800f,150f, p)


        p.color = Color.rgb(214,221,247)
        p.style = Paint.Style.FILL
        p.color = Color.rgb(214,221,247)
        c.drawCircle(-300f,450f,1000f, p)
        c.drawCircle(-300f,1600f,1000f, p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 6f
        p.color = Color.LTGRAY
        c.drawCircle(-300f,450f,1005f, p)

        p.color = Color.WHITE
        c.drawCircle(1100f,10f,4f, p) //x -> para altura; y -> largo; con pantalla horizontal
        c.drawCircle(1000f,150f,4f, p)
        c.drawCircle(1000f,150f,4f, p)
        c.drawCircle(1000f,300f,4f, p)
        c.drawCircle(1000f,700f,4f, p)
        c.drawCircle(1000f,1200f,4f, p)
        c.drawCircle(1000f,1400f,4f, p)
        c.drawCircle(970f,70f,4f, p)
        c.drawCircle(800f,159f,4f, p)
        c.drawCircle(750f,30f,4f, p)
        c.drawCircle(800f,1200f,4f, p)
        c.drawCircle(800f,900f,4f, p)
        c.drawCircle(750f,800f,4f, p)
        c.drawCircle(970f,1500f,4f, p)
        c.drawCircle(970f,1700f,4f, p)
        c.drawCircle(1000f,900f,4f, p)
        c.drawCircle(1200f,800f,4f, p)
        c.drawCircle(980f,550f,4f, p)
        c.drawCircle(870f,100f,4f, p)
        c.drawCircle(750f,980f,4f, p)
        c.drawCircle(900f,1100f,4f, p)
        c.drawCircle(800f,1320f,4f, p)
        c.drawCircle(910f,1250f,4f, p)
        c.drawCircle(800f,1700f,4f, p)
        c.drawCircle(825f,1020f,4f, p)
        c.drawCircle(815f,1550f,4f, p)
        c.drawCircle(860f,800f,4f, p)
        c.drawCircle(815f,670f,4f, p)
        c.drawCircle(650f,990f,4f, p)
        c.drawCircle(750f,400f,4f, p)
        c.drawCircle(1050f,25f,4f, p)
        c.drawCircle(870f,1420f,4f, p)
        c.drawCircle(1050f,1100f,4f, p)


        p.color = Color.rgb(106,75,53)
        p.style = Paint.Style.FILL
        c.drawRect(50f,500f,70f,50f,p)
        p.color = Color.rgb(247,47,74)
        c.drawRect(65f,395f,300f,55f,p) //left -> x(vertical)  top -> y(horizontal-ancho de Rect) right -> altura de Rect
        p.color = Color.rgb(194,194,194)
        c.drawRect(65f,500f,300f,395f,p)
        p.color = Color.rgb(251,251,185)
        c.drawRect(65f,160f,235f,95f,p)
        c.drawRect(110f,200f,235f,350f,p)
        p.color = Color.rgb(14,14,15)
        c.drawRect(360f,295f,300f,400f,p)

        p.color = Color.rgb(106,75,53)
        c.drawRect(220f,595f,207f,903f,p)
        p.color = Color.rgb(19,39,100)
        c.drawRect(220f,600f,400f,900f,p)
        p.color = Color.rgb(251,251,185)
        c.drawRect(220f,640f,350f,700f,p)
        c.drawRect(250f,740f,350f,840f,p)
        p.color = Color.rgb(14,14,15)
        c.drawRect(450f,820f,400f,870f,p)
        p.color = Color.rgb(57,29,12)
        c.drawRect(320f,100f,430f,130f,p)

        p.color = Color.rgb(198,37,76)
        c.drawRect(600f,1400f,450f,1600f,p)
        p.color = Color.rgb(106,75,53)
        c.drawRect(450f,1395f,465f,1605f,p)
        p.color = Color.rgb(251,251,185)
        c.drawRect(550f,1420f,490f,1465f,p)
        c.drawRect(550f,1480f,485f,1550f,p)

        //arboles
        p.color = Color.rgb(57,29,12)
        c.drawRect(630f,1500f,600f,1540f,p)
        p.color = Color.rgb(42,85,20)
        c.drawCircle(450f,112f,60f, p)

        p.color = Color.rgb(64,28,18)
        c.drawRect(40f,1100f,150f,1130f,p)
        p.color = Color.rgb(57,124,23)
        c.drawCircle(230f,1120f,90f, p)

        p.color = Color.rgb(57,29,12)
        c.drawRect(445f,450f,550f,470f,p)
        p.color = Color.rgb(30,52,19)
        c.drawCircle(550f,456f,50f, p)

        p.color = Color.rgb(64,28,18)
        c.drawRect(40f,1530f,150f,1560f,p)
        p.color = Color.rgb(83,133,33)
        c.drawCircle(230f,1550f,90f, p)


    }
}