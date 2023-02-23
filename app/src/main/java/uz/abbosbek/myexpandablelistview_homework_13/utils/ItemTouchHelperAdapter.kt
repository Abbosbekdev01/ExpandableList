package uz.abbosbek.myexpandablelistview_homework_13.utils

open class ItemTouchHelperAdapter {
    /** Item larni ko'chirish uchun ishlatiladi*/
    fun onItemMove(fromPosition:Int, toPosition:Int) {}

    /** Item larni ong yoki chapga o'tkazish uchun ishlatiladi*/
    fun onItemDismiss(position:Int) {}
}