package com.g_one_nursesapp.database

import androidx.lifecycle.LiveData
import com.g_one_nursesapp.entity.AttachmentEntity
import com.g_one_nursesapp.entity.MessageEntity
import com.g_one_nursesapp.entity.relation.MessageWithAttachments

class AppRepository(private val appDao: AppDao) {
    // Messages
    val fetchMessage: LiveData<List<MessageWithAttachments>> = appDao.fetchMessages()
    suspend fun insertOneMessage(message: MessageEntity) {
        appDao.insertOneMessage(message)
    }
    suspend fun deleteMessages() {
        appDao.deleteMessages()
    }

    // Attachment
    val fetchAttachments: LiveData<List<AttachmentEntity>> = appDao.fetchAttachments()
    suspend fun insertOneAttachment(attachment: AttachmentEntity) {
        appDao.insertOneAttachment(attachment)
    }
}