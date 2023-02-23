package uz.abbosbek.myexpandablelistview_homework_13.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.BaseExpandableListAdapter
import uz.abbosbek.myexpandablelistview_homework_13.R
import uz.abbosbek.myexpandablelistview_homework_13.databinding.ItemChildBinding
import uz.abbosbek.myexpandablelistview_homework_13.databinding.ItemParentBinding
import uz.abbosbek.myexpandablelistview_homework_13.models.User

class MyExpandAdapter(
    val list: ArrayList<String>,
    val map: HashMap<String, ArrayList<User>>,
    val context: Context
) : BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return list.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return map[list[p0]]!!.size
    }

    override fun getGroup(p0: Int): Any {
        return list[p0]
    }

    override fun getChild(p0: Int, p1: Int): Any {
        val list = map[list[p0]]!!
        return list[p1]
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View {
        val itemParentBinding =
            ItemParentBinding.inflate(LayoutInflater.from(p3?.context), p3, false)
        itemParentBinding.tvParent.text = list[p0]
        return itemParentBinding.root

        val animation = AnimationUtils.loadAnimation(context, R.anim.item_animation)
        itemParentBinding.root.startAnimation(animation)

    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View {
        val itemChildBinding = ItemChildBinding.inflate(LayoutInflater.from(p4?.context), p4, false)
        itemChildBinding.tvChild.text = map[list[p0]]!![p1].name
        return itemChildBinding.root

        val animation = AnimationUtils.loadAnimation(context, R.anim.item_animation)
        itemChildBinding.root.startAnimation(animation)
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }
}