package com.own_world.popupmenubar

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class CostomeClass {

    fun test( context: Context, view: View) {
        val popupMenu = PopupMenu(context, view)
        popupMenu.inflate(R.menu.menu)

        popupMenu.setOnMenuItemClickListener {
            when(it!!.itemId) {
                R.id.addnew -> {
                    Toast.makeText(context, "clicked - ADD NEW", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.delete -> {
                    Toast.makeText(context, "clicked - Delete", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.save -> {
                    Toast.makeText(context, "clicked - SAVE", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }

        }

        try {
            val popup = PopupMenu::class.java.getDeclaredField("mPopup")
            popup.isAccessible = true
            val menu = popup.get(popupMenu)
            menu.javaClass
                .getDeclaredMethod("setForceShowIcon", Boolean::class.java)
                .invoke(menu, true)
        }catch (e:Exception)
        {
        }
        finally {
            popupMenu.show()
        }
    }
}
