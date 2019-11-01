package com.example.responsi_321

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class Home_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("iPhone 6 Plus", "Spesifikasi Apple.", R.drawable.ip6plus))
        list.add(Model("iPhone 6s Plus", "Spesifikasi Apple.", R.drawable.ip6splus))
        list.add(Model("iPhone 6s", "Spesifikasi Apple.", R.drawable.ip6s))
        list.add(Model("iPhone 8 Plus", "Spesifikasi Apple.", R.drawable.ip8plus))
        list.add(Model("iPhone 8", "Spesifikasi Apple", R.drawable.ip8))
        list.add(Model("iPhone 11 Pro Max", "Spesifikasi Apple", R.drawable.ip11pm))
        list.add(Model("iPhone 11", "Spesifikasi Apple", R.drawable.ip11))
        list.add(Model("iPhone SE", "Spesifikasi Apple", R.drawable.ipse))
        list.add(Model("iPhone X", "Spesifikasi Apple", R.drawable.ipx))
        list.add(Model("iPhone 11 Pro", "Spesifikasi Apple", R.drawable.ip11p))

        listview.adapter = My_Adapter(this, R.layout.activity_register, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this@Home_Activity, "(iPhone 6 Plus)(iPhone 6 Plus benar-benar memanjakan mata Anda berkat tampilan layarnya yang begitu jernih, resolusi tinggi 1920 x 1080 piksel bersama kerapatan layar hingga mencapai 400 ppi, membuat layar seluas 5,5 inci mendapatkan kejernihan yang sebenarnya.", Toast.LENGTH_LONG).show();
            }
            if (position == 1){
                Toast.makeText(this@Home_Activity, "(iPhone 6s Plus) (iPhone 6S Plus merupakan perangkat yang sempurna untuk Anda yang mendambakan sebuah smartphone berlayar besar dengan tingkat ketipisan yang telah disesuaikan. Dengan menampilkan layar Retina Display berukuran 5,5 inci yang memiliki kualitas gambar sangat jernih, iPhone 6S Plus mampu memanjakan Anda disaat menonton sebuah video, bermain game dan juga menyelesaikan tugas keseharian Anda.", Toast.LENGTH_LONG).show();
            }
            if (position == 2){
                Toast.makeText(this@Home_Activity, "(iPhone 6s)(Dengan fitur dan kemampuan baru yang memungkinkan Anda menyelesaikan lebih banyak hal dengan lebih cepat dan mudah, iOS 11 membuat iPhone menjadi lebih andal, personal, dan cerdas.", Toast.LENGTH_LONG).show();
            }
            if (position == 3){
                Toast.makeText(this@Home_Activity, "(iPhone 8 Plus)(iPhone 8 Plus memperkenalkan desain kaca yang sepenuhnya baru. Kamera paling populer di dunia, kini lebih baik lagi. Chip yang paling andal dan cerdas di ponsel pintar. Pengisian daya nirkabel yang begitu mudah dilakukan. Dan pengalaman augmented reality yang tak pernah mungkin sebelumnya. iPhone 8 Plus merupakan iPhone generasi baru.", Toast.LENGTH_LONG).show();
            }
            if (position == 4){
                Toast.makeText(this@Home_Activity, "(iPhone 8)(sistem operasi seluler paling personal dan aman di dunia, dilengkapi dengan fitur andal dan dirancang untuk melindungi privasi Anda.", Toast.LENGTH_LONG).show();
            }
            if (position == 5){
                Toast.makeText(this@Home_Activity, "(iPhone 11 Pro Max)(iPhone 11 Pro Max merupakan penerus dari iPhone XS dan XS Max yang dirilis tahun lalu", Toast.LENGTH_LONG).show();
            }
            if (position == 6){
                Toast.makeText(this@Home_Activity, "(iPhone 11)(The iPhone 11 offers superb cameras, a more durable design and excellent battery life for an affordable price, making it the iPhone to buy for most people.", Toast.LENGTH_LONG).show();
            }
            if (position == 7){
                Toast.makeText(this@Home_Activity, "(iPhone SE)(Berdasarkan analis produk Apple kenamaan, Ming-Chi Kuo, iPhone SE 2 akan dirilis pada awal 2020", Toast.LENGTH_LONG).show();
            }
            if (position == 8){
                Toast.makeText(this@Home_Activity, "(iPhone X)(Apple sejak awal adalah menciptakan iPhone yang sepenuhnya berisi layar. Yang begitu menghanyutkan sehingga tak ada lagi batasan antara perangkat dan pengalaman. Dan begitu cerdas sehingga dapat merespons dengan sekali sentuh, atau bahkan sekali pandang. Dengan iPhone X, visi ini menjadi kenyataan. Selamat datang, masa depan..", Toast.LENGTH_LONG).show();
            }
            if (position == 8){
                Toast.makeText(this@Home_Activity, "(iPhone 11 Pro)(Sistem tiga kamera transformatif yang menambahkan kemampuan luar biasa tanpa kerumitan. Lompatan tak tertandingi dalam hal kekuatan baterai. Dan chip luar biasa dengan pembelajaran mesin yang semakin canggih dan menghilangkan batasan kemampuan ponsel pintar. Selamat datang di iPhone pertama yang karena kecanggihannya layak disebut Pro.", Toast.LENGTH_LONG).show();
            }


}
    }
    }

