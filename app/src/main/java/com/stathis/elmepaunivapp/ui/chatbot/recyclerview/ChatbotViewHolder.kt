package com.stathis.elmepaunivapp.ui.chatbot.recyclerview

import android.view.View
import com.stathis.elmepaunivapp.abstraction.AbstractViewHolder
import com.stathis.elmepaunivapp.callbacks.ElmepaClickListener
import com.stathis.elmepaunivapp.model.LocalModel
import com.stathis.elmepaunivapp.ui.chatbot.model.Answer
import com.stathis.elmepaunivapp.ui.chatbot.model.ChatbotHeader
import com.stathis.elmepaunivapp.ui.chatbot.model.Question
import kotlinx.android.synthetic.main.holder_answer_item.view.*
import kotlinx.android.synthetic.main.holder_question_item.view.*

class ChatbotViewHolder(itemView : View, callback : ElmepaClickListener) : AbstractViewHolder(itemView, callback) {

    override fun present(data: LocalModel) {
        when(data){
            is Answer -> itemView.bot_reply_txt.text = data.text
            is Question -> itemView.user_msg_txt.text = data.text
            is ChatbotHeader -> {}
        }
    }
}