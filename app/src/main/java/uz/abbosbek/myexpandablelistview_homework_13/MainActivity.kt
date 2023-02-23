package uz.abbosbek.myexpandablelistview_homework_13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import android.widget.Toast
import uz.abbosbek.myexpandablelistview_homework_13.adapters.MyExpandAdapter
import uz.abbosbek.myexpandablelistview_homework_13.databinding.ActivityMainBinding
import uz.abbosbek.myexpandablelistview_homework_13.utils.MyData
import uz.abbosbek.myexpandablelistview_homework_13.utils.MyData.map
import uz.abbosbek.myexpandablelistview_homework_13.utils.MyData.titleList_Parent

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var myExpandAdapter: MyExpandAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        MyData.addElement()

        myExpandAdapter = MyExpandAdapter(titleList_Parent, map, this)
        binding.myExpand.setAdapter(myExpandAdapter)

        binding.myExpand.setOnChildClickListener { expandableListView, view, i, i2, l ->

            /** child bosilganda keyingi Activity ga o'tyabti*/
            val intent = Intent(this, MainActivityInformation::class.java)
            /** child ma'lumotlarini keyin oynaga olib o'tyabti*/
            intent.putExtra("key_info", map[titleList_Parent[i]]?.get(i2))
            startActivity(intent)

           // Toast.makeText(this, map[titleList_Parent[i]]?.get(i2).toString(), Toast.LENGTH_SHORT).show()

            true
        }


        /** bu yerda bitta parent ochilganda qolgan parentlar yopiladi*/
        binding.myExpand.setOnGroupExpandListener(object : ExpandableListView.OnGroupExpandListener{
            var child_one = -1
            override fun onGroupExpand(p0: Int) {
                if (p0 != child_one){
                    binding.myExpand.collapseGroup(child_one)
                    child_one = p0
                }
            }
        })
    }
}