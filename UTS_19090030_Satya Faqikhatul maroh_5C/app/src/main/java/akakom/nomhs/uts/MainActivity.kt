package akakom.nomhs.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.monterey,"Mac OS Monterey","mac os versi 21","MacOS Monterey adalah versi paling baru dari semua versi MacOS," +
        "versi ini rilis pada pertengahan tahun 2021,untuk saat ini masih sedikit review tentang MacOS Monterey dikarenakan versi ini masih sangat baru"))

        data?.add(DataModel(R.drawable.bigsur,"Mac Os Big Sur","mac os versi 20", "MacOS Big Sur adalah versi lanjutan dari versi Catalina,di versi ini  banyak sekali perubahan yang dibawa" +
        ",versi ini memiliki tampilan yang sangat menarik yang membuat banyak ditunggu tunggu oleh pengguna Macbook"))

        data?.add(DataModel(R.drawable.catalina,"Mac Os Catalina","mac os versi 19", "MacOS Catalina adalah versi MacOS yang lebih baru dari versi Mojave" +
        "MacOS ini membawakan tampilan yang lebih menarik dari veri sebelumnya"))

        data?.add(DataModel(R.drawable.mojave,"Mac Os mojave","mac os versi 18", "Yang terakhir adalah OS Mac terbaru, bernama macOS Mojave."+
                "Belum banyak informasi yang beredar mengenai update terbaru ini karena mojave sendiri masih dalam tahap Beta."+
                "Namun satu hal yang pasti ada di update ini adalah MacOS Dark Edition! Berbanding terbalik dengan seri sebelumnya, "+
                "Mojave memiliki kemampuan untuk menampilkan design UI yang gelap. Sangat cocok buat kalian yang suka bekerja pada suasana dengan sedikit pencahayaan."))

        data?.add(DataModel(R.drawable.highsierra,"Mac Os High Sierra","mac os versi 17", "macOS 10.13 High Sierra dirilis ke publik pada 25 September 2017."+
                "Sama seperti OS X El Capitan dan OS X Mountain Lion, High Sierra adalah pembaruan yang dikhususkan untuk penyempurnaan sistem sebelumnya,"+
                "fitur barunya engga terlalu banyak. High Sierra juga telah menggunakan Apple File System yang terbaru."))

        data?.add(DataModel(R.drawable.sierra,"Mac Os Sierra","mac os versi 16", "Dari semua nama-nama sistem operasi mac os terbaru diatas" +
                "kalian tentunya sekarang sudah memasuki versi update Sierra (10.12). Dengan fitur terbaru," +
                "SIRI, tampilan design yang lebih elegan, Apple Music, iCloud terbaru, Loading Speed performance upgrade, Storage optimization, "+
                "Apple Pay dan masih banyak lagi."))



        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}