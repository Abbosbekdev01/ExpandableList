package uz.abbosbek.myexpandablelistview_homework_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import uz.abbosbek.myexpandablelistview_homework_13.databinding.ActivityMainInformationBinding
import uz.abbosbek.myexpandablelistview_homework_13.models.User

class MainActivityInformation : AppCompatActivity() {
    private val binding by lazy { ActivityMainInformationBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        /** child ma'lumotlarini qabul qilyabdi*/
        val info = intent.getSerializableExtra("key_info") as User

        /**child bosilganda shu Activity ga child malumotlarni olib o'tyabmiz*/
        binding.tvTextInfo.text =info.information

        /** bu yerda ActionBar name child name o'zgartirib beradi*/
        supportActionBar?.title= info.name

//        supportActionBar?.setDisplayShowHomeEnabled(true)
        /** child bosilib boshqa oynaga o'tganda orqaga qaytarish funksiyasi*/
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    /** bu yerda yuqoridagi funksiyani ishlatyabmiz*/
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}